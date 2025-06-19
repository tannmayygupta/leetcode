// https://leetcode.com/problems/reverse-vowels-of-a-string/
//345. Reverse Vowels of a String



import java.util.Scanner;

public class ReverseVowelsofaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(reverseVowels(s));
        
    }
    public static String reverseVowels(String s) {

        // as strings are immuatable we can't use s.charAt(st) OR END and then using
        // s.replace(char old , char new ) to replace the vowel 

        // so we just convert our string to char[] ch 

        // then use two pointer approch : st and end 

        // if point points to vowel we replace otherwise we move st and end pointer 

        // and return the string after replacement new String(ch) ;

        int st = 0 ; 
        int end = s.length() - 1 ;

        char[] ch = s.toCharArray();

        while(st < end){

            // char chst = s.charAt(st).toLowerCase() ;
            // char chend = s.charAt(end).toLowerCase() ;

            char chst = Character.toLowerCase(ch[st]);

            char chend = Character.toLowerCase(ch[end]);

            
            if(chst == 'a' || chst == 'e' || chst == 'i' || chst == 'o' || chst == 'u' ){
                if(chend == 'a' || chend == 'e' || chend == 'i' || chend == 'o' || chend == 'u'){
                    char temp = ch[st] ;

                    ch[st] = ch[end] ;

                    ch[end] = temp;

                    st++;

                    end--;
                    
                }
                else{
                    // means end me vowel nhi hai
                    end--;
                }
            }
            else{
                st++;
            }

        }

        return new String(ch) ;

        
    }
}
