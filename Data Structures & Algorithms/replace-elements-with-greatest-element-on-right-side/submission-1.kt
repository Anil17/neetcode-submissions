class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val arrSize = arr.size
        var i = arrSize - 1
        val result = IntArray(arrSize)
        result[arrSize - 1] = -1
        var rightMax = arr[i]
        i--

        while (i >= 0) {
            rightMax = maxOf(rightMax, arr[i + 1])
            result[i] = rightMax
            i--
        }
        return result
    }
}
