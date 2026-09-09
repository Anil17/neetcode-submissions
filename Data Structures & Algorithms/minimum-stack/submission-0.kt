class MinStack() {
    val minStack = mutableListOf<Int>()
    var minElement: Int = Int.MAX_VALUE
    val minElements = mutableListOf(minElement)

    fun push(`val`: Int) {
        minStack.addLast(`val`)
        minElement = if (`val` < minElement) {
            minElements.addLast(`val`)
            `val`
        } else {
            val currLast = minElements.removeLast()
            minElements.addLast(`val`)
            minElements.addLast(currLast)
            minElement
        }
    }

    fun pop() {
        if (minStack.isNotEmpty()) {
            val removeElement = minStack.removeLast()
            minElements.remove(removeElement)
            minElement = minElements.last()
        }
    }

    fun top(): Int {
        return if (minStack.isNotEmpty()) {
            minStack.last()
        } else {
            -1
        }
    }

    fun getMin(): Int {
        return minElement
    }
}
