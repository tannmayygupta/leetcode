import java.util.Scanner;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hayStack = sc.nextLine();
        String needle = sc.nextLine();

        int x = strStr(hayStack, needle);

        System.out.println(x);

        
    }

    public static int strStr(String haystack, String needle) {
    
            if(needle.isEmpty()) {
                return 0;
            }
            else if(haystack.length() < needle.length()) {
                return -1;
            }
            else if(haystack.length() == needle.length() && haystack.equals(needle)) {
                return 0;
            } 
            else {
                for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                    String s = "";
                    for (int j = 0; j < needle.length(); j++) {
                        s += haystack.charAt(i + j);
                    }
                    if (s.equals(needle)) {
                        return i;
                    }
                }
            }
    
            return -1;
        }
}
