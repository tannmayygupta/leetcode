public class FindtheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        int[] arr = new int[26] ;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            int m = c - 'a';
            arr[m]++;
        }

        for(int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i);
            int m = c - 'a';
            arr[m]--;
        }
        
        
        for (int i = 0 ; i < 26 ; i++ ) {
            if (arr[i] != 0) {
                return (char) (i + 'a');
            }
        }

        return ' ';
            
    }
}
