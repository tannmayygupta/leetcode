import java.util.Arrays;

public class LogestConsecutive {
    public static void main(String[] args) {
        int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        
        // -1,-1,0,1,3,4,5,6,7,8,9

        // 0,3,7,2,5,8,4,6,0,1
        // int arr[] = {0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(arr);   
        // // for(int i = 0 ; i<arr.length ; i++){
        // //     System.out.println(arr[i]);
        // // }           
        // int count = 1 ;
        // for(int i = 0 ; i < arr.length - 1 ; i++){
        //     if(arr[i] + 1 == arr[i+1]){ // 0,0  , 0,1   2,3
        //         count++;
        //     }
        // }
        // System.err.println(count);

        int count = 0 ;

        for(int i = 0 ; i < arr.length - 1 ; i++){
            
            if(arr[i] + 1 == arr[i+1]){ // -1,-1    -1,0    0,1   1,3  ,3,4   4,5  ,5,6  ,6,7  , 7,8  ,8,9
                count++;
            }
            else{
                count = 0;
            }
        }
        System.out.println(count+1);
    }
}
