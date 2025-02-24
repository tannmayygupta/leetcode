public class SpeacialArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};

        boolean b = isArraySpecial(nums);
        System.out.println(b);

        
    }
    public static boolean isArraySpecial(int[] arr) {
        int count = 0 ;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if( (arr[i] % 2 == 0) && (arr[i+1] % 2 == 0)){
                count++;
            }
            else if((arr[i] % 2 != 0) && (arr[i+1] % 2 != 0)){
                count++;
            }
        }
        if(count == 0){
            return true;
        }
        else{
            return false ;
        }
    }
}
