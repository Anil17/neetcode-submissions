class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val arrSize = arr.size
        var i = arrSize - 1
        val result = IntArray(arrSize)
        var rightMax = -1

        while (i >= 0) {
            result[i] = rightMax
            rightMax = maxOf(rightMax, arr[i])
            i--
        }
        return result
    }
}
