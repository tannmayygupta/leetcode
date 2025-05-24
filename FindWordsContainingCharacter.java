import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';

        System.out.println(findWordsContaining(words, x));


    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < words.length ; i++){
            String s = words[i];
            if(s.contains(String.valueOf(x))){ // char to string we do string.valueOf(char c) ;
                ans.add(i);
            }
        }

        return ans ;
    }
}

