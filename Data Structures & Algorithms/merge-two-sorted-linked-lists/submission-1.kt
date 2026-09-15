/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        when {
            list1 == null -> {
                return list2
            }

            list2 == null -> {
                return list1
            }
        }
        val head = ListNode(-1)

        var curr1 = list1
        var curr2 = list2
        var temp: ListNode? = head

        while (curr1 != null && curr2 != null) {
            if (curr1.`val` <= curr2.`val`) {
                temp?.next = curr1
                curr1 = curr1.next
            } else {
                temp?.next = curr2
                curr2 = curr2.next
            }
            temp = temp?.next
        }

        temp?.next = curr1 ?: curr2

        return head.next
    }
}
