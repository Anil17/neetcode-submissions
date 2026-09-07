class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        /*var updatedNumsSize = 0
        for (i in nums.indices) {
            if (nums[i] != `val` && updatedNumsSize != i) {
                nums[updatedNumsSize] = nums[i]
                updatedNumsSize += 1
            }
        }
        return updatedNumsSize
         */

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
