import java.util.HashSet;

public class LongestBalancedSubstringI {
    public static void main(String[] args) {

        String s = "abbac";

        System.out.println(longestBalanced(s));

    }

    // 3713. Longest Balanced Substring I

    public static int longestBalanced(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                int c = ch - 'a';
                freq[c]++;

                HashSet<Integer> set = new HashSet<>();

                for (int m = 0; m < 26; m++) {
                    if(freq[m] > 0){
                        set.add(freq[m]);
                    }
                }

                if (set.size() == 1) {
                    max = Math.max(max, j - i + 1);
                }

            }
        }
        return max;
    }

}
