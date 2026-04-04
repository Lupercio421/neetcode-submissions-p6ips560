"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        
        oldToCopy = {None:None}

        curr = head
        while curr:
            copy = Node(curr.val) #deep copy of the node
            oldToCopy[curr] = copy
            curr = curr.next #iterate until we reach None
        
        curr = head
        while curr:
            copy = oldToCopy[curr]
            print("aaaaa " + str(copy))
            # required to set the pointers to ensure a full deep copy
            copy.next = oldToCopy[curr.next]
            copy.random = oldToCopy.get(curr.random)
            curr = curr.next

        return oldToCopy[head]