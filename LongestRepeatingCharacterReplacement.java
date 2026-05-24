public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2 ;
        System.out.println(characterReplacement(s, k));
    }
    // bruteforce O(n^2)
    // public int characterReplacement(String s, int k) {
    //     int maxLength = 0 ;
    //     int n = s.length() ;
    //     for(int i = 0 ; i < n ; i++){
    //         int[] hash = new int[26];
    //         int maxFreq = 0 ;
    //         for(int j = i ; j < n ; j++){
    //             hash[s.charAt(j) - 'A']++;
    //             maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);
    //             int length = j - i + 1 ;
    //             if(length - maxFreq <= k){
    //                 maxLength = Math.max(maxLength, length);
    //             }else{
    //                 break ;
    //             }
    //         }
    //     }

    //     return maxLength ;
    // }

    // optimal solution using sliding window as 
    // we will use the break condition of brutforce to shring window 
    // while(length - maxFreq > k){
    // we will shrink the window from left
    // }

    public static int characterReplacement(String s, int k) {
        int left = 0 ;
        int maxLength = 0 ;
        int n = s.length() ;
        int[] hash = new int[26];
        int maxFreq = 0 ;
        for(int right = 0 ; right < n ; right++){
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);
            while((right - left + 1) - maxFreq > k){
                hash[s.charAt(left) - 'A']--;
                left++; // shrink the window 
                maxFreq = 0 ; // coz if maxFreq char while shrinking get less freq but wothout puting new we will not able to change the maxFreq so initialed to zero
                for(int i = 0 ; i < 26 ; i++){
                    maxFreq = Math.max(maxFreq, hash[i]); 
                }
            }
            if((right - left + 1)- maxFreq <= k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength ;
    }
}