import java.util.*;
public class FinalValueOfVariableAfterPerformingOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0 ; i < n ; i++){
            s[i] = sc.nextLine();
        }
        int m = finalValueAfterOperations(s);
        System.out.println(m);
        
    }
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0 ;
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                X += 1 ;
            }
            else if(operations[i].equals("--X") || operations[i].equals("X--")){
                X = X - 1 ;
            }
        }
        return X ;
    }
}