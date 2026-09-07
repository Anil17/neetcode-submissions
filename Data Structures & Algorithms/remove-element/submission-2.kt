class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var updatedNumsSize = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[updatedNumsSize] = nums[i]
                updatedNumsSize += 1
            }
        }
        return updatedNumsSize
    }
}
