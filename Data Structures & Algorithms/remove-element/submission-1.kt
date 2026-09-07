class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var countNewElements = 0
        var i = 0
        while (i < nums.size) {
            if (nums[i] != `val`) {
                nums[countNewElements] = nums[i]
                countNewElements++   
            }
            i++
        }
        return countNewElements
    }
}
