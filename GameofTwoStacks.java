// Game of Two Stacks
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GameofTwoStacks {
    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
            a.add(4);
            a.add(2);        
            a.add(4);        
            a.add(6);        
            a.add(1);        
        List<Integer> b = new ArrayList<>();
            b.add(2);
            b.add(1);        
            b.add(8);
            b.add(5); 
             
        System.out.println(twoStacks(10,a,b));
   }

   public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
    
        int[] a1 = new int[a.size()];
        int[] b1 = new int[b.size()];
        
        for(int i = 0 ; i < a1.length ; i++){
            a1[i] = a.get(i);
        }
        
        for(int i = 0 ; i < b1.length ; i++){
            b1[i] = b.get(i);
        }
        
        return (maxCou(maxSum,0,0,a1,b1) - 1) ;
        
        // see copy this is not the correct way to do it ;
        // as there can be outher element less that the top that can help us to get the max pop count
        
        // int currsum = 0 ;
        // int count = 0 ;
        // int i= 0 ;
        // int j = 0 ;
        // int maxpop = 0 ;
        // while(currsum < maxSum){
        //     if(a.get(i) < b.get(j)){
        //         currsum+=a.get(i);
        //         count++;
        //         i++;
        //     }else if(a.get(i) > b.get(j)){
        //         currsum+=b.get(j);
        //         count++;
        //         j++;
        //     }else if(a.get(i) == b.get(j)){
        //         currsum+=a.get(i);
        //         count++;
        //         i++;
        //     }
            
        //     if(currsum <= maxSum){
        //         maxpop = Math.max(maxpop,count);
        //     }
        // }
        // return maxpop ;
    }
    
    public static int maxCou(int maxSum,int currSum,int count ,int[] a, int[] b){
        if(maxSum < currSum){
            return count ;
        }
        if(a.length == 0 || b.length == 0){
            return count ;
        }
        
        int ans1 = maxCou(maxSum, currSum + a[0] , count + 1, Arrays.copyOfRange(a, 1, a.length), b);
        int ans2 = maxCou(maxSum, currSum + b[0] , count + 1, a, Arrays.copyOfRange(b, 1, b.length));
        
        return Math.max(ans1 , ans2);
    }
}