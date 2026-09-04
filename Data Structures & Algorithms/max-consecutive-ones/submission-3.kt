class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxOnes = 0
        var countOnes = 0
        for (i in nums.indices) {
            countOnes = if (nums[i] == 1) {
                countOnes + 1
            } else {
                0
            }

            if (countOnes > maxOnes) {
                maxOnes = countOnes
            }
        }

        return maxOnes
    }
}
