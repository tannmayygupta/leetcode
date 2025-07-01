import java.util.ArrayList;
import java.util.Scanner;

    // 500. Keyboard Row

    // https://leetcode.com/problems/keyboard-row/description/

            // firstly initialised 3 string for char in row1, row2, row3

            // then in string array for a string at ith index,

            // converted the character to lowercase

            // check for the character in which row they belong

            // by incrementing my counters mam1, mam2, mam3 for respective rows 

            // and checking at the end if(words[i].length() == mam1 or mam2 or     
            // mam3 )

            // adding that word[i] to the arraylist, if found true

            // coverting list and returning it 

            // return ans.toArray(new String[0])

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
