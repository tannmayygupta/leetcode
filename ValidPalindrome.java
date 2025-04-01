import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = isPalindrome(s);
        System.out.println(b);

    }
    public static boolean isPalindrome(String s) {
        // int left = 0 ;
        // int right = s.length() - 1;

        // while(left <= right){
        //     if(s.charAt(left) == s.charAt(right)){
        //         left++;
        //         right--;
        //     }
        //     else if(s.charAt(left) == " "){
        //         left++;
        //     }
        //     else if(s.charAt(right) == " "){
        //         right--;
        //     }
        //     else{
        //         break;
        //     }
        // }

        String s1 = s.toLowerCase();

        List<Character> list = new ArrayList<>();

        for(int i = 0 ; i < s1.length() ; i++){
            char c = s1.charAt(i);
            if(c >= 'a' && c <='z'){
                list.add(c);
            }
            if(c >= '0' && c <='9'){
                list.add(c);
            }

        }

        int left = 0 ;
        int right = list.size() - 1;

        while(left < right){
            if(list.get(left) != list.get(right)){
                return false ;
            }
            right--;
            left++;
        }
        return true ;
    }
}
