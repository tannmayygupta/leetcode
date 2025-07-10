import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckifNumbersAreAscendinginaSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(areNumbersAscending(s));
        
    }
    public static boolean areNumbersAscending(String s) {

        String[] s1 = s.split(" ");

        List<Integer> li = new ArrayList<>();

        for(int i = 0 ; i < s1.length ;i++){
            int c = s1[i].charAt(0);
            if(c >= 48 && c <= 57){
                li.add(Integer.valueOf(s1[i]));
            }
        }
        
        // m1 to convert list to array we use li.toArray method (for my understanding)
        Integer[] arr = li.toArray(new Integer[0]);

        // m2 with looping (for me)
        // Integer[] arr = new Integer[li.size()];
        // for(int i = 0 ; i < arr.length ; i++){
        // }

        
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        
        return true ;
    }
}
