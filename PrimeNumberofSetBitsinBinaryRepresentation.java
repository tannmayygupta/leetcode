public class PrimeNumberofSetBitsinBinaryRepresentation {
    public static void main(String[] args) {
        int left = 6 ;
        int right = 10 ;

        int x = countPrimeSetBits(left, right);

        System.out.println(x);
        
    }
    public static int countPrimeSetBits(int left, int right) {
            
            int cou = 0 ;
    
            for(int i = left ; i <= right ; i++){
                String b = Integer.toBinaryString(i);
                cou += prime(b);
            }
    
            return cou;
    
        }
    
    public static int prime(String b){
            
            int count = 0 ;
    
            for(int j = 0 ; j < b.length() ; j++){
                char m = b.charAt(j);
                if(m == '1'){
                    count++;
                }
            }
    
            if(isPrime(count) == true){
                return 1 ;
            }
    
            return 0 ;
        }
    
        public static boolean isPrime(int i){
            if(i < 2){
                return false ;
            }
            else{
                for(int j = 2 ; j <= (int) Math.sqrt(i) ; j++){
                    if(i % j  == 0){
                        return false ;
                    }
                }
                return true ; 
            }
        }
}
