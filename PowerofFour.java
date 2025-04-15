public class PowerofFour {

    public static void main(String[] args) {
        boolean x = isPowerOfFour(16);
        System.out.println(x);
    }
    public static boolean isPowerOfFour(int n) {
    
            long m = 1 ;
    
            int count = 0 ;
    
            if(n <= 0){
                return false ;
            }
    
            while(n > m){
                m = m * 4 ;
            }
            
            if(n == m){
                return true;
            }
    
            return false ;
    }
}
