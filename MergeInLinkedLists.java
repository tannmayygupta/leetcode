public class MergeInLinkedLists {
    // 1669. Merge In Between Linked Lists
    /*
     * Intuition
     * We need to remove the nodes from index a to b in list1 and insert list2 in
     * their place.
     * So the idea is:
     * 
     * 1)Find the node just before index a in list1.
     * 2)Find the node just after index b in list1.
     * 3)Connect the first part of list1 to list2.
     * 4)Then connect the tail of list2 to the remaining part of list1.
     * This way, the middle portion (from a to b) gets replaced by list2.
     * 
     * Approach
     * Traverse list1 to get:
     * 
     * 1)Node at position a-1
     * 2)Node at position b+1
     * 3)Find the tail of list2.
     * Update pointers:
     * 
     * 1)node(a-1).next = list2
     * 2)tail(list2).next = node(b+1)
     * 3)Return list1 as the final merged list.
     * Complexity
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

            ListNode temp1 = get(list1, a);

            ListNode temp2 = get(list1, b).next; // this points to node before a node b

            ListNode taill2 = tail(list2);
            // ListNode headl2 = list2 ;
            temp1.next = list2;

            if (temp2 != null) {
                taill2.next = temp2.next;
            } else {
                taill2.next = null;
            }

            return list1;
        }

        public ListNode tail(ListNode list) {
            ListNode temp1 = list;
            if (temp1 == null) {
                return null;
            }

            while (temp1.next != null) {
                temp1 = temp1.next;
            }

            return temp1;
        }

        public ListNode get(ListNode list, int index) {
            ListNode temp1 = list;
            if (temp1 == null) {
                return null;
            }

            for (int i = 0; i < index - 1; i++) {
                temp1 = temp1.next;
            }

            return temp1;
        }
    }
}
