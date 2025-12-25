import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>();
        // 2, 1, 5, 3, 4
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(4);

        chaos(q);
        
    }
    public static void chaos(List<Integer> q) {
        int bribe = 0 ;
       // 
       for(int i = 0 ; i < q.size() ; i++){
            if(q.get(i) - (i+1) > 3){
                System.out.println("Too chaotic");
                return;
            }
            int person = q.get(i) ;
            for(int j = Math.max(0 , person - 2 ) ; j < i ; j++){
                if(q.get(j) > (person )){
                    bribe++;
                }
            }
        } 
        System.out.println(bribe);
    }

}
