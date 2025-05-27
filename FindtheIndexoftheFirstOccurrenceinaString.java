import java.util.Scanner;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hayStack = sc.nextLine();
        String needle = sc.nextLine();

        System.out.println(strStr(hayStack, needle));

        
    }

    // public static int strStr(String haystack, String needle) {
    
    //         if(needle.isEmpty()) {
    //             return 0;
    //         }
    //         else if(haystack.length() < needle.length()) {
    //             return -1;
    //         }
    //         else if(haystack.length() == needle.length() && haystack.equals(needle)) {
    //             return 0;
    //         } 
    //         else {
    //             for (int i = 0; i <= haystack.length() - needle.length(); i++) {
    //                 String s = "";
    //                 for (int j = 0; j < needle.length(); j++) {
    //                     s += haystack.charAt(i + j);
    //                 }
    //                 if (s.equals(needle)) {
    //                     return i;
    //                 }
    //             }
    //         }
    
    //         return -1;
    //     }


    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        if(haystack.length() < needle.length()){
            return -1;
        }

        for(int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            int st = i ; 
            int end = i + needle.length() ;

            if(haystack.substring(st, end).equals(needle)){
                return st ;
            } 

        }

        return -1;
}

}