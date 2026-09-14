
class ListNode(val value: Int, var next: ListNode? = null)

class LinkedList {
    var head: ListNode? = null
    var tail: ListNode? = null

    fun get(index: Int): Int {
        var i = 0
        var curr = head

        while (curr != null) {
            if (i == index) {
                return curr.value
            }
            curr = curr?.next
            i++
        }

        return -1
    }

    fun insertHead(value: Int) {
        val newHead = ListNode(value)

        newHead.next = head
        head = newHead

        if (newHead.next == null) {
            tail = newHead
        }
    }

    fun insertTail(value: Int) {
        val newTail = ListNode(value)

        tail?.next = newTail
        tail = newTail

        if (head == null) {
            head = newTail
        }
    }

    fun remove(index: Int): Boolean {
        var i = 0
        var prev: ListNode? = null
        var curr = head

        if (index == 0 && curr != null) {
            curr = curr.next
            head = curr
            return true
        }

        while (curr != null) {
            if (i == index) {
                if (prev?.next == tail) {
                    tail = prev
                }
                prev?.next = curr.next
                curr.next = null
                return true
            }
            prev = curr
            curr = curr.next
            i++
        }

        return false
    }

    fun getValues(): List<Int> {
        val values = mutableListOf<Int>()
        var curr = head

        while (curr != null) {
            values.add(curr.value)
            curr = curr.next
        }

        return values
    }
}
