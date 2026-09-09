class Solution {
    fun calPoints(operations: Array<String>): Int {
        val result = Stack<Int>()
        var sumOfElements = 0
        operations.forEach {
            when (it) {
                "+" -> {
                    val currLastElement = result.pop()
                    val currPenultimateElement = result.pop()
                    val newElement = currLastElement + currPenultimateElement

                    result.push(currPenultimateElement)
                    result.push(currLastElement)
                    result.push(newElement)
                    sumOfElements += newElement
                }
                "D" -> {
                    val newElement = result.peek() * 2
                    result.push(newElement)
                    sumOfElements += newElement
                }
                "C" -> {
                    val removedElement = result.pop()
                    sumOfElements -= removedElement
                }
                else -> {
                    val newElement = it.toInt()
                    result.push(newElement)
                    sumOfElements += newElement
                }
            }
        }

        return sumOfElements
    }
}
