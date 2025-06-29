import java.util.Scanner;

// 1832. Check if the Sentence Is Pangram

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        System.out.println(sentence);

    }

    public static boolean checkIfPangram(String sentence) {

        int[] arr = new int[26];

        for(int i = 0 ; i < sentence.length() ; i++){
            char mam = sentence.charAt(i);
            int tan = mam - 'a';
            arr[tan]++ ; 
        }

        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] == 0){
                return false ;
            }
        }

        return true ;
        
    }
}
