import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
//         // int[] nums = {3,2,3} ;

//         int[] nums = {1} ;

//         Arrays.sort(nums);

//         List<Integer> ele = new ArrayList<Integer>(); 

//         int count = 1 ;
//         int n = nums.length ;
//         for(int i = 0 ; i < n - 1 ; i++){
//             if(nums[i] != nums[i+1]){
//                 count = 1 ;
//             }
//             else{
//                 count++;
//                 if(count >= Math.round(n/3)){
//                     ele.add(nums[i]);
//                 }
//             }
//         }

//         System.err.println(ele);
//     }
// }


// class Solution {
    
}

public List<Integer> majorityElement(int[] nums) {
    List<Integer> list = new ArrayList<Integer>();
    int add = 0 ; // for which i was getting MLE
    int count = 0 ;
    int n = nums.length ;
    int k = n / 3 ;
    if(n == 1){
        list.add(nums[0]);
    }
    else if(n == 2){
        if(nums[0] == nums[1]){
            list.add(nums[0]);
        }
        else{
            list.add(nums[0]);
            list.add(nums[1]);
        }
    }
    else{
        
        // here contain remove or avoid duplicate element adding

        for (int i = 0; i < n; i++) {

            count = 1;

            if (list.contains(nums[i])) {
                continue;
            }
        
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }
        
            if (count > k) {
                list.add(nums[i]);
            }
            
        }
    }

    // GETTING MLE AT THIS POINT MY LOGIC IS COREECT 
    //     for(int i = 0 ; i < n ; i++){

    //         for(int j = i + 1 ; j < n; j++){
    //             if(nums[i] == nums[j]){
    //                 count++;
                        
    //                 if(count >= k){
    //                     list.add(nums[i]);
    //                 }
    //             }
    //         }
    //         count = 0 ;
    //     }
    // }
    // list = list = new ArrayList<>(new HashSet<>(list));

    return list ;   

}
}