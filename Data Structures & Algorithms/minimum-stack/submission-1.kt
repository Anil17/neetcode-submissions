class MinStack() {
    val elementStack = Stack<Int>()
    val minStack = Stack<Int>()

    fun push(`val`: Int) {
        elementStack.push(`val`)
        val newMinElement = if (minStack.isNotEmpty() && minStack.peek() < `val`) {
            minStack.peek()
        } else {
            `val`
        }
        
        minStack.push(newMinElement)
    }

    fun pop() {
        if (elementStack.isNotEmpty()) {
            elementStack.pop()
            minStack.pop()
        }
    }

    fun top(): Int {
        return if (elementStack.isNotEmpty()) {
            elementStack.last()
        } else {
            -1
        }
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}
