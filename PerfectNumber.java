public class PerfectNumber {
    // 507. Perfect Number
    // https://leetcode.com/problems/perfect-number/
    public static void main(String[] args) {

        int num = 28 ;
        System.out.println(checkPerfectNumber(num));
        
    }
    public static boolean checkPerfectNumber(int num) {
        int n = 1 ;
        int sum = 0 ;
        
        while(n <= num / 2){

            if(num % n == 0){
                sum += n ;
            }

            n++;
        }
        
        if(sum == num){
            return true ;
        }

        return false ;
    }
}
