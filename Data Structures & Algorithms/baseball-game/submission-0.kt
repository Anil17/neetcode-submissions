class Solution {
    fun calPoints(operations: Array<String>): Int {
        val result = Stack<Int>()
        operations.forEach {
            when (it) {
                "+" -> {
                    val currLastElement = result.pop()
                    val currPenultimateElement = result.pop()
                    val newElement = currLastElement + currPenultimateElement

                    result.push(currPenultimateElement)
                    result.push(currLastElement)
                    result.push(newElement)
                }
                "D" -> {
                    val newElement = result.peek() * 2
                    result.push(newElement)
                }
                "C" -> {
                    result.pop()
                }
                else -> { 
                    result.push(it.toInt())
                }
            }
        }
        
        return result.sum()
    }
}
