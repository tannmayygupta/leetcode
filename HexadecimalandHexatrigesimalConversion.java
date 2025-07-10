import java.util.Scanner;

public class HexadecimalandHexatrigesimalConversion {

    // 3602. Hexadecimal and Hexatrigesimal Conversion 
    
    // https://leetcode.com/problems/hexadecimal-and-hexatrigesimal-conversion/description/
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(concatHex36(n));

    }
    public static String concatHex36(int n) {

        int hexadec = n * n ;

        int hexatri = n * n * n ;

        StringBuilder sb1 = new StringBuilder();

        StringBuilder sb2 = new StringBuilder();

        while(hexadec > 0 ){

            int h = hexadec % 16 ;

            if(h >= 10){
                sb1.append((char) ('A' + h - 10 ));
            }
            else{
                sb1.append(h);
            }

            hexadec = hexadec / 16 ;
        }

        sb1.reverse();

        String s1 = sb1.toString();

        while(hexatri > 0 ){

            int h = hexatri % 36 ;

            if(h >= 10){
                sb2.append((char) ('A' + h - 10));
            }
            else{
                sb2.append(h);
            }

            hexatri = hexatri / 36 ;
        }

        sb2.reverse();

        String s2 = sb2.toString();

        return s1 +  s2 ;
    }
}
