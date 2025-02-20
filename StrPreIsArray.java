import java.util.Scanner;

public class StrPreIsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StrPreIsArray S = new StrPreIsArray();
        int n ; 
        System.out.println("Enter length of array");
        n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < n ; i++){
            words[i] = sc.nextLine();
        }
        
        S.StrPreIsArray(s, words);

    }
    static boolean StrPreIsArray(String s , String[] words){
        StringBuilder w = new StringBuilder();
        int count = 0 ;
        for(int i = 0 ; i < words.length ; i++){
            w.append(words[i]);
            if(s.equals(w.toString())){
                count = 1 ;
                break ;
            }

        }

        if(count == 1){
            return true ;
        }
        else{
            return false ;
        }
    }
}
