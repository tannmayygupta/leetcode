public class RearrangeArray {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int n = nums.length ;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int k = 0 ;
        int f = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < 0){
                neg[k++] = nums[i];
            }
            else{
                pos[f++] = nums[i];
            }
        }

        k = 0 ;
        f = 0 ;

        for(int j = 0 ; j < n ; j++){
            if(j % 2 == 0){
               nums[j] = pos[f++];
            }
            else{
                nums[j] = neg[k++];
            }
        }

        for(int m = 0 ; m < nums.length ; m++ ){
            System.out.print(nums[m]+" ");
        }
    }
}
