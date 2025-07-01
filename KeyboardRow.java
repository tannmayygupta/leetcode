import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardRow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for(int i = 0 ; i < n ; i++){
            words[i] = sc.nextLine();
        }

        System.out.println(findWords(words).toString());
        
    }
    public static String[] findWords(String[] words) {

        String frow = "qwertyuiop";

        String srow = "asdfghjkl";

        String trow = "zxcvbnm";

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0 ; i < words.length ; i++){
            int mam1 = 0 ;
            int mam2 = 0 ;
            int mam3 = 0 ;

            for(int j = 0 ; j < words[i].length() ; j++){

                String ch = Character.toString(Character.toLowerCase(words[i].charAt(j))) ;

                if(frow.contains(ch)){
                    mam1++;
                }
                else if(srow.contains(ch)){
                    mam2++;
                }
                else if(trow.contains(ch)){
                    mam3++;
                }

                if(mam1 == words[i].length() || mam2 == words[i].length() || mam3 == words[i].length()){
                    ans.add(words[i]);
                }
            }
        }

        // 1st way to return 

        // return ans.toArray(new String[0]) ;

        // 2nd way to return is 
        // nahi aara method yaad sticks to basics
        
        String[] arr = new String[ans.size()];

        ans.toArray(arr);

        return arr ;

    }
}
