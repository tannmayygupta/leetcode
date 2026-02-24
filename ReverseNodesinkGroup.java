public class ReverseNodesinkGroup {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        display(reverseKGroup(head, 2));
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        // head = [1,2,3,4,5], k = 2
        // debug it to understand
        // 1,2,3,4,5
        // k
        ListNode knode = get(head, k);

        if (knode == null || k == 1) {
            return head;
        }
        // 1 , 2 , 3 , 4 , 5
        // t k x t1
        ListNode temp1 = knode.next;
        ListNode temp = head;
        knode.next = null; // so that in reverse function it treat kth node as last
        int itr = 0;

        while (knode != null) {

            ListNode h = reverse(temp);

            if (itr == 0) {
                head = h;
            }
            temp.next = temp1;
            temp = temp1;

            knode = get(temp, k);

            if (knode != null) {
                temp1 = knode.next;
            }
            itr++;

        }

        return head;

    }

    public static ListNode reverse(ListNode temp) {
        if (temp == null || temp.next == null) {
            return null;
        }

        ListNode prev = null;
        ListNode first = temp;
        ListNode second = temp.next;

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

    public static ListNode get(ListNode head, int k) {
        ListNode temp = head;

        for (int i = 1; i < k; i++) { // as the count of first node is 1
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }

        return temp;
    }
}

// 25. Reverse Nodes in k-Group

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
