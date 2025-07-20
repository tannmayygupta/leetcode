public class CheckDivisibilitybyDigitSumandProduct {
    public static void main(String[] args) {

        System.out.println(checkDivisibility(23));
        
    }
    public static boolean checkDivisibility(int n) {
        
        int sumdigi = 0 ;

        int muldigi = 1 ;

        while(n > 0){
            int rem = n % 10 ;
            sumdigi = sumdigi + rem ;
            muldigi = muldigi * rem ; 
            n = n/10 ;
        }

        int sum = sumdigi + muldigi ;

        if(n % sum == 0){
            return true ;
        }

        return false ;
    }
}
