import java.util.Arrays;
import java.util.Scanner;

public class FindtheOriginalTypedStringI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(possibleStringCount(word));

    }
    public static int possibleStringCount(String word) {
        int[] arr = new int[26];

        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            int m = c - 'a';

            arr[m]++;
        }

        Arrays.sort(arr);

        int index = 0 ;
        int sum = 0 ;

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            if(arr[i] == 0){
                break;
            }
            sum +=arr[i];
            index += 1 ;
        }

        return sum - index + 1 ;
        
    }
}
