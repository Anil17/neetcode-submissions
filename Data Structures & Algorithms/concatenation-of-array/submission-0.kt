class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(2 * nums.size)
        for (i in ans.indices) {
            ans[i] = nums[i%nums.size]
        }

        return ans
    }
}
