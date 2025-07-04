public class Sumofdigits1945 {
    public static void main(String[] args) {

        int k = 0 ;
        
        String s = "iiii" ;
        StringBuilder Strnum = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a' + 1;
            Strnum.append(n);
        }

        int n = sumOfDigit(Strnum.toString());

        for (int i = 1; i < k; i++) { 
            n = sumOfDigit(String.valueOf(n)); 
        }

        // return n ;
        System.out.println(n);
    }

    static int sumOfDigit(String Strnum) {
        int sum = 0;
        for (int i = 0; i < Strnum.length(); i++) {
            sum += Strnum.charAt(i) - '0'; 
        }
        return sum;  
    }
}
