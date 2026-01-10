public class Insertinatdoublylinkedlist {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
        // GFG QUE in linklist Doubly by strivers
    }
}

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        // if(p == 0){
        //     return insertfirst(head , x);
        // }
        
        Node temp = head ;
        Node nn = new Node(x);
        
        for(int i = 0 ; i < p && temp!=null ; i++){ // we have to chek for the condotion coz
        
                                                        // size of liklisty not given
            temp = temp.next ;
        }
        
        nn.next = temp.next ;
        if(temp.next != null){
            temp.next.prev = nn ;
        }
        nn.prev = temp ;
        temp.next = nn ;
        
        
        return head ;
    }
    
    public Node insertfirst(Node head , int x){
        Node nn = new Node(x);
        head.prev = nn ;
        nn.next = head ;
        head = nn ;
        return head ;
    }
}