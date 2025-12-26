import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i = 0 ; i < n ; i++){
		         arr[i] = sc.nextInt();
		    }
		    
		    int proteinLeft = 0 ;
		    int flag = 0 ;
		    int ind = -1 ;
		    for(int i = 0 ; i < n ; i++){
		         if(k > arr[i]){
		             proteinLeft = arr[i] + proteinLeft ;
		             if(k > proteinLeft){
		                 flag = 1 ;
		                 ind = i + 1 ;
		                 break ;
		             }else{
		                 proteinLeft = proteinLeft - k ;
		             }
		         }else{
		             proteinLeft += (arr[i] - k);
		         }
		    }
		    if(flag == 1 ){
		        System.out.println("NO "+ind);
		    }else{
		        System.out.println("YES");
		    }
		}
    }
}
