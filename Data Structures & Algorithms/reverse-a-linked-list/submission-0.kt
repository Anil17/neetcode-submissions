/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }

        var prev: ListNode? = null
        var curr: ListNode? = head
        var next: ListNode? = curr?.next

        while (next != null) {
            curr?.next = prev

            prev = curr 
            curr = next
            next = curr?.next
        }

        curr?.next = prev
        return curr
    }
}
