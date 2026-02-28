public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        
    }
}



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// 160. Intersection of Two Linked Lists 
//  https://leetcode.com/problems/intersection-of-two-linked-lists/solutions/7614819/160-intersection-of-two-linked-lists-by-q24ev/
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1 = headA ;
        ListNode temp2 = headB ;


        while(temp1 != temp2){
            if(temp1 == null){
                temp1 = headB ;
            }else{
                temp1 = temp1.next ;
            }

            if(temp2 == null){
                temp2 = headA ; // when temp null the head shifting id one operation 
            }
            else{
                temp2 = temp2.next ; // this if not null is operation 
            }
        }

        return temp1 ;
        
    }
}
