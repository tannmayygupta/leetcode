import java.util.Scanner;

public class FindtheKthCharacterinStringGameI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        System.out.println(kthCharacter(k));
        
    }

    // 3304. Find the K-th Character in String Game I

    public static char kthCharacter(int k) {

        String word = "a";

        while(word.length() <= k){
            word += task(word);
        }

        return word.charAt(k - 1);
        
    }

    public static String task(String word){

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            if(c == 'z'){
                sb.append('a');
            }
            else{
                sb.append((char) (c + 1) );
            }
        }

        return sb.toString();
    }
    
}
