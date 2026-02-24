public class AddTwoNumbersII {
    public static void main(String[] args) {
        // 445. Add Two Numbers II

        ListNode head = new ListNode();
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        ListNode head2 = new ListNode();

        head2.next = new ListNode(2);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(1);

        display(addTwoNumbers(head, head2));

    }

    public static void display(ListNode l1){
        
        ListNode templl = l1.next  ;

        while (templl != null) {
            System.out.print(templl.val+" ");
            templl = templl.next ;
        }
        System.out.println("END");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode reversel1 = reverse(l1); // 3 4 2 7
        ListNode reversel2 = reverse(l2); // 4 6 5

        ListNode temp1 = reversel1; // 3
        ListNode temp2 = reversel2;// 4

        ListNode dummy = new ListNode();

        ListNode temp = dummy; // 0

        int carry = 0;

        while (temp1 != null && temp2 != null) {

            int sum = temp1.val + temp2.val + carry;

            if (sum >= 10) {
                temp.val = sum % 10;
                carry = sum / 10;
            } else {
                temp.val = sum;
                carry = 0;
            }

            if (temp1.next != null && temp2.next != null) {
                temp.next = new ListNode();
                temp = temp.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 != null) {
            int sum = temp1.val + carry;

            // new node creation
            temp.next = new ListNode();
            temp = temp.next;

            if (sum >= 10) {
                // temp.next = new ListNode();
                // temp = temp.next ; writing two times in if write it above to create node
                temp.val = sum % 10;
                carry = sum / 10;
            } else {
                // temp.next = new ListNode();
                // temp = temp.next ; writing two times in if write it above to create node
                temp.val = sum;
                carry = 0;
            }
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            int sum = temp2.val + carry;

            // new node creation
            temp.next = new ListNode();
            temp = temp.next;

            if (sum >= 10) {
                // temp.next = new ListNode();
                // temp = temp.next ; writing two times in if write it above to create node
                temp.val = sum % 10;
                carry = sum / 10;
            } else {
                // temp.next = new ListNode();
                // temp = temp.next ; writing two times in if write it above to create node
                temp.val = sum;
                carry = 0;
            }
            temp2 = temp2.next;
        }

        if (carry > 0) {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = carry;
            temp.next = null;
        }

        ListNode reversedummy = reverse(dummy);

        return reversedummy;

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
