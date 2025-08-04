import java.util.Arrays;
// 137. Single Number II
// https://leetcode.com/problems/single-number-ii/description/
public class SingleNumberII {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};

        System.out.println(singleNumber(arr));
    
    }
    public static int singleNumber(int[] arr) {

        if(arr.length == 1){
            return arr[0];
        }
        
        Arrays.sort(arr);

        int i = 0 ; 

        while(i < arr.length){
            if((i < arr.length - 2) && (arr[i] == arr[i+1]) && (arr[i+1] == arr[i+2])){
                i=i+3;
            }
            else if(i > 0 && i < arr.length - 1 && arr[i-1] != arr[i] && arr[i] != arr[i+1] ){
                return arr[i];
            }
            else if(i == 0 && arr[i] != arr[i+1]){
                return arr[i];
            }
            else if(i == arr.length - 1 && arr[i] != arr[i-1]){
                return arr[i];
            }else{
                i++;
            }
        }
        return -1 ;
    }
}
