import java.util.Scanner;

public class ZeroString {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int cou1 = 0;
            int cou0 = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    cou1++;
                } else {
                    cou0++;
                }
            }
            // 111110010011: 0 = 4
            // 111000
            // 00000011001: 1= 3
            if (cou0 >= cou1) {
                // ans= cou1 ;
                System.out.println(cou1);
            } else if (cou0 < cou1) {
                System.out.println(cou0 + 1);
            }
        }
    }
}
