import java.util.*;

public class ClothingStore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt(); // 1
            int Y = sc.nextInt(); // 3
            int Z = sc.nextInt(); // 4
            int A = sc.nextInt(); // 5
            int B = sc.nextInt(); // 2
            int C = sc.nextInt(); // 1
            // T--;

            int happy = 0;
    
            int sellS = Math.min(A, X); // 1
            A = A - sellS;
            X = X - sellS;
    
            int sellL = Math.min(B, Y); // 1
            B = B - sellL;
            Y = Y - sellL;
    
            int sellXL = Math.min(C, Z); // 2
            C = C - sellXL;
            Z = Z - sellXL;
    
            int convertXLToL = Math.min(Z, B);
            // count += convertXLToL;
            B -= convertXLToL;
            Z -= convertXLToL;
            int convertXLToS = Math.min(Z, A);
            // count += convertXLToS;
            Z -= convertXLToS;
            A -= convertXLToS;
            int convertLToS = Math.min(Y, A);
            // count += convertLToS;
            Y -= convertLToS;
            A -= convertLToS;
    
    
            happy = sellXL + sellL + sellS + convertXLToL + convertXLToS + convertLToS ;
            
            System.out.println(happy);

        }
    }
}