class DynamicArray(capacity: Int) {
    private var nums: IntArray
    private var length: Int = 0
    private var capacity: Int = capacity

    init {
        nums = IntArray(capacity)
    }

    fun get(i: Int): Int {
        return nums[i]
    }

    fun set(i: Int, n: Int) {
        nums[i] = n
    }

    fun pushback(n: Int) {
        if (length == capacity) {
            resize()
        }
        nums[length++] = n
    }

    fun popback(): Int {
        length--
        return nums[length]
    }

    private fun resize() {
        capacity = 2 * capacity
        val newNums = IntArray(capacity)

        for (i in 0..<length) {
            newNums[i] = nums[i]
        }

        nums = newNums
    }

    fun getSize(): Int {
        return length
    }

    fun getCapacity(): Int {
        return capacity
    }
}
