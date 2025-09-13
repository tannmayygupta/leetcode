import java.util.Scanner;

// 3541. Find Most Frequent Vowel and Consonant
// https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/?envType=daily-question&envId=2025-09-13

public class FindMostFrequentVowelandConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        System.out.println(maxFreqSum(s));
    }

    static int maxFreqSum(String s) {
        int[] fre = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int c = ch - 'a' ;
            fre[c]++;
        }

        int max_vowel = 0 ;
        int max_consonant = 0 ;

        int a = 'a' - 'a';
        int i = 'i' - 'a';
        int o = 'o' - 'a';
        int e = 'e' - 'a';
        int u = 'u' - 'a';

        for(int j = 0 ; j < 26 ; j++){
            if(j == a || j == e || j == i || j == o || j == u ){
                if(max_vowel < fre[j]){
                    max_vowel = fre[j] ;
                }
            }else{
                if(max_consonant < fre[j]) {
                    max_consonant=fre[j];
                }
            }
        }

        return max_consonant + max_vowel ;

    }
}
