class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var numsSize = nums.size

        while (i < numsSize) {
            if (nums[i] == `val`) {
                nums[i] = nums[numsSize - 1]
                numsSize--
            } else {
                i++
            }
        }

        return numsSize
    }
}
