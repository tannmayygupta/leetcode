import java.util.*;
public class ReversePrefixOfWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        String word = reversePrefix(s,ch);
        System.out.println(word);
                
        }
        
        public static String reversePrefix(String word, char ch) {
        int count = 0 ;
        int ind = -1 ;
        StringBuilder w = new StringBuilder();
        for(int i = 0 ; i < word.length() ;i++){
            if(word.charAt(i) == ch){
                count = 1 ;
                ind = i ;
                break;
            }
        }
        if(ind == -1){
            return word ;
        }
        for(int i = ind ; i >= 0 ; i--){
            w.append(word.charAt(i));
        }
        for(int i = ind + 1 ; i < word.length() ; i++){
            w.append(word.charAt(i));
        }

        return w.toString() ;
    }
}