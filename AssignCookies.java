import java.util.*;
public class AssignCookies {
// 455. Assign Cookies
// https://leetcode.com/problems/assign-cookies/post-solution/?submissionId=1943161505
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] g = {1,5,3,3,4};
        int[] s = {4,2,1,2,1,3};

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n1 = g.length;
        int n2 = s.length;
        int i = 0 ;
        int j = 0 ;

        while(i < n1 && j < n2 ){
            if(g[i] <= s[j]){
                i++;
            }
            j++;
        }

        return i;

    }
}