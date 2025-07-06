import java.util.Arrays;

// Intuition
// simple and bruteforce approach

// Approach
// i basically use a 2 pointer i and i+1 and compare and increment the cou otherwise reinitalise it

// Complexity
// Time complexity: O(n)
// Space complexity: O(1)

// 1394. Find Lucky Integer in an Array

// https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

public class FindLuckyIntegerinanArray {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};

        System.out.println(findLucky(arr));
        
    }
    public static int findLucky(int[] arr) {

        Arrays.sort(arr);

        int ans = -1 ;

        int cou = 1;

        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                cou++;
            }
            else{
                if(cou == arr[i]){
                    ans = arr[i];
                }
                cou = 1 ;
            }
        }

        return ans ;
    }
}
