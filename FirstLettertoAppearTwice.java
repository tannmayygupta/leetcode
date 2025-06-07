import java.util.Scanner;

public class FirstLettertoAppearTwice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(repeatedCharacter(s));
        
    }
    public static char repeatedCharacter(String s) {
        int[] arr = new int[26];

        for(int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            int j = c - 'a';

            if(arr[j] == 1){
                return c ;
            }
            else{
                arr[j]++;
            }
        }

        return 0 ;
    }
}
