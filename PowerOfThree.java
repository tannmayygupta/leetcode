public class PowerOfThree {

    public static void main(String[] args) {
        
        int n = 5 ;

        boolean x = isPowerOfThree(n);

        System.out.println(x);


    }
    
    public static boolean isPowerOfThree(int n) {
    
            long m = 1 ;
    
            int count = 0 ;
    
            if(n <= 0){
                return false ;
            }
    
            while(n > m){
                m = m * 3 ;
            }
            
            if(n == m){
                return true;
            }
    
            return false ;
    }
}
