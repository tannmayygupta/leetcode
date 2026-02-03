import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ;i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int negcou = 0 ;
            int poscou = 0 ;

            for(int i = 0 ; i < n ; i++){
                if(arr[i] == -1){
                   negcou++;
                }else{
                    poscou++;
                }
            }

            if(negcou % 2 == 0 && poscou >= negcou){
                System.out.println("0");
                // 7
                // 4
                // -1 -1 1 -1
                // 5
                // -1 -1 -1 1 1
                // 4
                // -1 1 -1 1
                // 3 
                // -1 -1 -1
                // 5
                // 1 1 1 1 1
                // 1
                // -1
                // 2
                // -1 -1
            }else{
                // int ans = (int) Math.ceil((double) negcou / 2) + 1 ;
                // poscou += ans ;
                int cou =  0 ;
                while (negcou > poscou || negcou % 2 != 0) {
                    negcou -= 1 ;
                    poscou += 1 ;
                    cou++;
                }
                System.out.println(cou);
            }
        }
    }
}
