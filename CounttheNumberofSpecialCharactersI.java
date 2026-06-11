

import java.util.Scanner;
// 3120. Count the Number of Special Characters I 
// https://leetcode.com/problems/count-the-number-of-special-characters-i/description/
public class CounttheNumberofSpecialCharactersI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(numberOfSpecialChars(word));
    }
    public static int numberOfSpecialChars(String word) {
        int cou = 0 ;
        int[] freqLow = new int[26];
        int[] freqUp = new int[26];

        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                freqLow[ch - 'a']++;
            }else if(ch >= 'A' && ch <= 'Z'){
                freqUp[ch - 'A']++;
            }
        }

        for(int i = 0 ; i < 26 ; i++){
            if(freqUp[i] > 0 && freqLow[i] > 0){
                cou++;
            }
        }
        return cou ;
    }
}
