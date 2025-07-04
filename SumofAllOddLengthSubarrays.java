public class SumofAllOddLengthSubarrays {
    public static void main(String[] args) {

        int[] arr = {1,4,2,5,3};

        System.out.println(sumOddLengthSubarrays(arr));
        
    }

    public static int sumOddLengthSubarrays(int[] arr) {

        int sum = 0 ;

        int odd = 0 ;

        if(arr.length % 2 == 0){
            odd = arr.length - 1 ;
        }
        else{
            odd = arr.length ;
        }

        // int odd = arr.length / 2 ;

        while(odd > 0){
            sum += cal(arr , odd);
            odd = odd - 2 ;
        }

        return sum ;
    }

    public static int cal(int[] arr,int odd){
        int subsum = 0 ;
        for(int i = 0 ; i <= arr.length - odd ; i++){
            int subsum1 = 0 ;
            for(int j = i ; j < odd + i ; j++ ){
                subsum1 += arr[j];
            }
            subsum += subsum1 ;
        }

        return subsum ;
    }

}
