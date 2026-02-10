public class PalindromeLinkedList {
    // https://leetcode.com/problems/palindrome-linked-list/ 
    // 234. Palindrome Linked List
    public static void main(String[] args) {

        ListNode head = new ListNode() ;
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));

    }
    public static boolean isPalindrome(ListNode head) {

        ListNode middle = middle(head); // take out middle
        ListNode rightHead = middle.next;

        ListNode rightReverseHead = reverse(rightHead); // the right half of the list
        middle.next = null;

        ListNode temp = head;
        ListNode revtemp = rightReverseHead;
        // 1 2

        while (temp != null && revtemp != null) {
            if (temp.val != revtemp.val) {
                return false;
            }
            temp = temp.next;
            revtemp = revtemp.next;
        }

        return true;

    }

    public static ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head) {

        // edge case
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;

        while (first != null) {
            first.next = prev;
            prev = first;
            first = second;

            // as second move ahead of first so we need to add this check
            if (second != null) {
                second = second.next;
            }

        }
        head = prev;
        return head;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

