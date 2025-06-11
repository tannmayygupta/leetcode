public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        // System.out.println(Character.toString());
    }
    public static void reverseString(char[] s) {
        // if hume bola hai ki reverse karna without extra space
        int start = 0 ;
        int end = s.length - 1 ;
        while(start < end){
            char c = s[start];
            char c2 = s[end];
            char temp = s[start] ;
            s[start] = s[end] ;
            s[end] = temp ;
            start++;
            end--;
        }        
    }
}
