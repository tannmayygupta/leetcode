import java.util.HashMap;

public class MaximizeHappinessofSelectedChildren {
    public static void main(String[] args) {
        int[] arr = {8,5,6,7,1};

        System.out.println(maximumHappinessSum(arr, 3));
        
    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        HashMap<Integer , Integer> ans = new HashMap<>();
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < happiness.length ; i++){
            if(ans.containsKey(happiness[i])){
                int val = ans.get(happiness[i]);
                ans.put(happiness[i],val + 1);
            }else{
                ans.put(happiness[i],1);
            }

            if(happiness[i] > max){
                max = happiness[i];
            }
        }

        long an = 0 ;

        while(k != 0 && max > 0){
            if(ans.containsKey(max)){
                an += max ;
                int value = ans.get(max);
                ans.put(max,value - 1);
                k--;
                max = max - 2 ;
            }else{
                max = max - 1 ;
            }
        }
        return an ;
    }
}