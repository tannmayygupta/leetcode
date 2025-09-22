import java.util.Arrays;

public class SortanArray {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        
        sortArray(nums);

        System.out.println(Arrays.toString(nums));
    
    }
    public static int[] sortArray(int[] nums) {

        int st = 0 ;

        int end = nums.length; 

        mergesort(nums , st , end);

        return nums ;        
    }

    static void mergesort(int[] nums , int st , int end){
        if(end - st == 1){
            return ;
        }

        int mid = (st + end) / 2 ;

        mergesort(nums, st , mid) ;

        mergesort(nums,mid,end);

        merge(nums,st,mid,end);
    }

    public static int[] merge(int[] nums , int st ,int mid , int end){
        
        int[] mix = new int[end - st];

        int i = st ; // st ko mid tak chalege

        int j = mid ; // issko mid se jo end hai waha tak


        int k = 0 ;

        while(i < mid && j < end){
            if(nums[i] < nums[j]){
                mix[k] = nums[i];
                i++;
            }else{
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = nums[i];
            i++;
            k++;
        }
        
        while(j < end){
            mix[k] = nums[j];
            j++;
            k++;
        }

        for(int s = 0 ; s < mix.length ; s++){
            nums[st+s] = mix[s];
        }
        return nums ;
    }
}
