import java.util.Arrays;
// Shortest Job first
// https://www.geeksforgeeks.org/problems/shortest-job-first/1


public class ShortestJobfirst {
    public static void main(String[] args) {
        int[] bt = {4,3,7,1,2};
        System.out.println(solve(bt));
    }
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        
        int time = 0 ;
        int ans = 0 ;
        //  1 , 2 , 3 , 4 , 7 
        for(int i = 0 ; i < bt.length ; i++){
            ans+=time ;
            time += bt[i];
        }
        
        return (int) (ans / bt.length) ;
    }
}
