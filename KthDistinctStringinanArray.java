import java.util.HashMap;

public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(
            kthDistinct(arr, k)
        ); 
    }   
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> ans = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(ans.containsKey(arr[i])){
                int cur = ans.get(arr[i]);
                ans.put(arr[i],cur+1);
            }
            else{
                ans.put(arr[i],1);
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(ans.get(arr[i]) == 1){
                k--;
                if(k == 0){
                    return arr[i];
                }
            }
        }

        return "";
        
    }
}
