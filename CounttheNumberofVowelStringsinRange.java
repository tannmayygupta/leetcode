public class CounttheNumberofVowelStringsinRange {
    public static void main(String[] args) {
        // 2586. Count the Number of Vowel Strings in Range
        // https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/description/
        String[] words = {"are","amy","u"};
        
        int left = 0 ;
        
        int right = 2 ;
    }
    public static int vowelStrings(String[] words, int left, int right) {
        int cou = 0 ;
        for(int i = left ; i <= right ; i++){
            String s1 = words[i];
            int st = 0 ;
            int end = s1.length() - 1 ;

            if(isvowel(s1.charAt(st)) && isvowel(s1.charAt(end))){
                cou++;
            }
        }

        return cou ;
    }

    public static boolean isvowel(char ch){
        return ch == 'a' || ch == 'u' || ch == 'o' ||ch == 'i' ||ch == 'e' ;
    }
}
