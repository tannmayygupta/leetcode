public class NumberofStepstoReduceaNumbertoZero {
    // 1342. Number of Steps to Reduce a Number to Zero
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public static void main(String[] args) {

        int num = 14 ;

        System.out.println(numberOfSteps(num));
        
    }
    public static int numberOfSteps(int num) {
        return helper(num , 0);
    }

    static int helper(int num , int step){
        if(num == 0){
            return step ;
        }

        if(num % 2 == 0){
            return helper(num/2 , step+1);
        }

        return helper(num - 1 , step + 1);
    }
}
