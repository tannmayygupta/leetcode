import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {2,2,5,3,3,1,1};

        Arrays.sort(arr);

        int i = 0 ;

        int curCount = 0 ;
        int preCount = 0 ;
        
        while(i<arr.length - 1){
            if(arr[i] != arr[i+1]){
                if(preCount > curCount){

                }
            }
            else{
                
            }
        }
    }

    
}
