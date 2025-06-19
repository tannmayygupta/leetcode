// https://leetcode.com/problems/faulty-keyboard/
// Faulty Keyboard

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(finalString(s));
    
    }
    public static String finalString(String s) {

        StringBuilder ans = new StringBuilder("");

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'i'){
                ans.reverse();        
            }
            else{
                ans.append(ch);
            }
        } 


        return ans.toString();  
        
    }
}
