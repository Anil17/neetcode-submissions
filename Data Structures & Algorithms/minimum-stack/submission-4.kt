class MinStack() {
    val stack = Stack<Long>()
    var minimum: Long = 0

    /*
    val elementStack = Stack<Int>()
    val minStack = Stack<Int>()
     */

    fun push(`val`: Int) { // 0, 1, -1
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

        /*
        elementStack.push(`val`)
        val newMinElement = if (minStack.isNotEmpty() && minStack.peek() < `val`) {
            minStack.peek()
        } else {
            `val`
        }

        minStack.push(newMinElement)
         */
    }

    fun pop() {
        if (stack.isNotEmpty()) {
            val poppedElement = stack.pop()
            if (poppedElement < 0) {
                minimum -= poppedElement.toInt()
            }
        }
        /*
        if (elementStack.isNotEmpty()) {
            elementStack.pop()
            minStack.pop()
        }
         */
    }

    fun top(): Int {
        return if (stack.peek() < 0) {
            minimum.toInt()
        } else {
            stack.peek().toInt() + minimum.toInt()
        }
        /*
        return if (elementStack.isNotEmpty()) {
            elementStack.last()
        } else {
            -1
        }
         */
    }

    fun getMin(): Int {
        return minimum.toInt()
    }
}
