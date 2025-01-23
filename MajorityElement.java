import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,1,2};

        double n = arr.length ;

        double m = Math.ceil(n/2) ;

        int num = (int) m;

        System.out.println(num);
    
        Arrays.sort(arr);
        int count = 1 ;
        int index = 0 ;

        for(int i = 0 ; i < arr.length - 1  ; i++){
            if(arr[i] != arr[i+1]){
                count = 1 ;
            }
            else{
                count++;
                if(count == num){
                    index = i ;
                    break ;
                }
            }
        }

        // return arr[index] ;   

    }    
}
