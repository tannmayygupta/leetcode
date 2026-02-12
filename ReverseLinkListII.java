public class ReverseLinkListII {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        display(head);
        display(reverseBetween(head, 1, 2));

    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // [3,5] 1 , 2
        ListNode leftHead = get(head, left); // 1
        ListNode rightHead = get(head, right);

        ListNode startConnectionNode = get(head, left - 1);
        ListNode endConnectionNode = get(head, right + 1);

        rightHead.next = null; // cause we need the end of list to be null ;

        ListNode reversell = reverse(leftHead);

        // we know left head will be our tail then what we do is that the
        if (startConnectionNode == null) {
            head = reversell;
        } else {
            startConnectionNode.next = reversell;
        }

        leftHead.next = endConnectionNode;

        return head;

    }

    public static ListNode get(ListNode head, int index) {

        if (index == 0) {
            return null;
        }

        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static ListNode reverse(ListNode head) {
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
            if (second != null) {
                second = second.next;
            }
        }

        return prev;
    }
}

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
