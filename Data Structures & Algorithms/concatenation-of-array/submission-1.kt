class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val numsSize = nums.size
        val ans = IntArray(2 * numsSize)
        for (i in nums.indices) {
            ans[i] = nums[i]
            ans[i + numsSize] = nums[i]
        }

        return ans
    }
}
