// lowercase character in the the string

//https://leetcode.com/problems/first-unique-character-in-a-string/

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "samiksha" ;
        System.out.println(firstUniqChar(s));

    }
    public static int firstUniqChar(String s) {
        int[]  arr = new int[26];

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            int j = c - 'a' ;
            arr[j]++;
        }

        for(int k = 0 ; k < s.length() ; k++){
            char ch = s.charAt(k);
            int m = ch - 'a';
            if(arr[m] == 1){
                return k ;
            }
        }
        return -1;
    }
}
