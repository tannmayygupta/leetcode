// brute force jisse time limit exeeded aara

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;

//         for(int i = 0 ; i < nums.length ; i++){
//             int curSum = 0 ;
//             for(int j = i ; j < nums.length ; j++){
//                 curSum += nums[j];
//                 maxSum = max(curSum,maxSum);
//             }
//         }
//         return maxSum ;
//     }
//     static int max(int curSum , int maxSum){
//         if(curSum > maxSum){
//             return curSum ;
//         }
//         else{
//             return maxSum ;
//         }
//     }
// }



// best way is kadane algo

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         int curSum = 0 ;

//         for(int i = 0 ; i < nums.length ; i++){
//             curSum += nums[i];
//             maxSum = max(curSum,maxSum);
//             if(curSum < 0){
//                 curSum = 0 ;
//             }
//         }
//         return maxSum ;
//     }
//     static int max(int curSum , int maxSum){
//         if(curSum > maxSum){
//             return curSum ;
//         }
//         else{
//             return maxSum ;
//         }
//     }
// }