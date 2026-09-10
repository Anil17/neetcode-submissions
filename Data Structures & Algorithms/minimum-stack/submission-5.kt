class MinStack() {
    val stack = Stack<Long>()
    var minimum: Long = 0

    fun push(`val`: Int) {
        minimum = if (stack.isEmpty()) {
            stack.push(0L)
            `val`.toLong()
        } else {
            stack.push(`val`.toLong() - minimum)
            if (`val` < minimum) {
                `val`.toLong()
            } else {
                minimum
            }
        }
    }

    fun pop() {
        if (stack.isNotEmpty()) {
            val poppedElement = stack.pop()
            if (poppedElement < 0) {
                minimum -= poppedElement.toInt()
            }
        }
    }

    fun top(): Int {
        return if (stack.peek() < 0) {
            minimum.toInt()
        } else {
            stack.peek().toInt() + minimum.toInt()
        }
    }

    fun getMin(): Int {
        return minimum.toInt()
    }
}
