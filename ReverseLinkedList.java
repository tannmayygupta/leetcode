public class ReverseLinkedList {
    // 206. Reverse Linked List
    public static void main(String[] args) {

        ListNode head = new ListNode();
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        display(reverseList(head)) ;
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;
        // 1 2 3 4 5
        // p f s (these are the position of pointer initaially)
        while (first != null) {
            first.next = prev;
            prev = first;
            first = second;
            // as second move ahead of first so
            // we need to add this check
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
