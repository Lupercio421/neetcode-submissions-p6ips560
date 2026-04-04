class ListNode():
    def __init__(self, val, next_node = None):
        self.val = val
        self.next = next_node

class LinkedList:
    
    def __init__(self):
        #Dummy node, will help with empty lists
        self.head = ListNode(-1)
        #starts at the head
        self.tail = self.head

    
    def get(self, index: int) -> int:
        curr = self.head.next
        i = 0
        #keep going until i is equal to the index we looking for
        while curr:
            if i == index:
                return curr.val
            i += 1
            curr = curr.next
        # we reached outside while loop, we got index out of bounds
        return -1
        
    def insertHead(self, val: int) -> None:
        new_node = ListNode(val)
        # set the new nodes' next pointer, to the dummy's next pointer
        new_node.next = self.head.next
        #now we can set the dummy node next as the new node
        self.head.next = new_node
        
        # edge case where list is null
        if not new_node.next:
            #if the list was empty before inserting, so we take on the case of the tail
            self.tail = new_node

    def insertTail(self, val: int) -> None:
        self.tail.next = ListNode(val)
        self.tail = self.tail.next

    def remove(self, index: int) -> bool:
        i = 0
        curr = self.head
        while i < index and curr:
            # move the curr to the node before target node
            i += 1
            curr = curr.next

        #
        if curr and curr.next:
            if curr.next == self.tail:
                # set the tail to the node before curr.next, i.e curr
                self.tail = curr
            curr.next = curr.next.next
            return True
        # false statement
        return False
        
    def getValues(self) -> List[int]:
        curr = self.head.next
        res = []

        while curr:
            res.append(curr.val)
            curr = curr.next
        return res
        
