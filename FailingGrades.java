import java.util.Scanner;

public class FailingGrades {
        public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- != 0){
            int N = sc.nextInt();
            
            int[] arr = new int[N];
            
            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
            }
            
            int avg = 0 ;
            
            int flag = 0 ;
            
            for(int i = 0 ; i < N - 1 ; i++){
                avg += arr[i] ;
                
                if(avg/(i + 1) < 40){
                    flag = 1 ;
                    break;
                }
            }
            
            if(flag == 1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
