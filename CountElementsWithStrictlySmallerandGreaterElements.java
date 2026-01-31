import javax.lang.model.util.Elements;

// # Intuition
// <!-- Describe your first thoughts on how to solve this problem. -->
// what I have done is a firstly iterated through the array and 
// got the minimum and the maximum element then I iterated through
//  via where I check the element should be greater than the minimum
//  and smaller than the maximum strictly then I do count and I have 
// returned the count simple solution brute force approach

// # Approach
// <!-- Describe your approach to solving the problem. -->
// read above intution you will get what i have done

// # Complexity
// - Time complexity: $$O(n)$$
// <!-- Add your time complexity here, e.g. $$O(n)$$ -->

// - Space complexity: $$O(1)$$
// <!-- Add your space complexity here, e.g. $$O(n)$$ -->

public class CountElementsWithStrictlySmallerandGreaterElements {
    public static void main(String[] args) {
        // 2148. Count Elements With Strictly Smaller and Greater Elements 
        int[] arr = {11,7,2,15} ;
        int n = arr.length ;  
        System.out.println(countElements(arr));  
    }
    public static int countElements(int[] nums) {
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        for(int i = 0 ; i < nums.length ; i++){
            if(max < nums[i]){
                max = nums[i];
            }

            if(min > nums[i]){
                min = nums[i];
            }
        }   

        int cou = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > min && nums[i] < max){
                cou++;
            }
        }

        return cou ;
    }
}
