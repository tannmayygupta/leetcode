import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,0,1};

        List<String> ans1 = getLongestSubsequence(words, groups);

        System.out.println(ans1);
    }
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        
        List<String> ans = new ArrayList<>();

        // aphele wale element ko har baar add karenege and them usske naad alternative dekhenenge 

        int alt = 1 ;

        if(groups[0] == 0){
            alt = 0 ;
        }

        ans.add(words[0]);

        for(int i = 1 ; i < groups.length ; i++ ){ // 1 0 1 1 
            if(alt != groups[i]){
                ans.add(words[i]);
                alt = groups[i];
            }
        }

        return ans ;
    }
}
