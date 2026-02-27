import java.util.LinkedList;
import java.util.Queue;

public class ChefBuildsStack {

    public static void main(String[] args) {
        
    }
}

class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int tos = -1 ;
    public void push(int x) {
        int s = q1.size();
        for(int i = 0 ; i < s ; i++){
            q2.add(q1.remove());
        }
        
        q1.add(x);
        
        int s1 = q2.size();
        
        for(int i = 0 ; i < s1 ; i++){
            q1.add(q2.remove());
        }
        
    }
    
    public int pop() {
        if(!q1.isEmpty()){
            return q1.remove();
        }
        
        return -1 ;
    }
    
    public int top() {
        if(!q1.isEmpty()){
            return q1.peek();
        }
        return -1 ;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
}