class Solution {
    fun deleteElementAtIdx(nums: IntArray, idx: Int) {
        for (i in idx..<nums.size - 1) {
            nums[i] = nums[i + 1]
        }
    }

    fun removeElement(nums: IntArray, `val`: Int): Int {
        val value = `val`
        var countRemovals = 0
        var i = nums.size - 1
        while (i >= 0) {
            if (nums[i] == value) {
                deleteElementAtIdx(nums, i)
                println(nums.contentToString())
                countRemovals++
            }
            i--
        }
        return nums.size - countRemovals
    }
}
