# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        dummy = ListNode()
        cur = dummy

        carry = 0
        while l1 or l2 or carry:
            v1 = l1.val if l1 else 0 #get the val of the node if non-empty, else just set value to 0
            v2 = l2.val if l2 else 0

            #new digit
            val = v1 + v2 + carry

            #say we have a two digit number, say it is 15
            carry = val // 10 #get the carry
            val = val % 10 #get the ones digit

            cur.next = ListNode(val)

            #update ptrs
            cur = cur.next
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None

        return dummy.next

