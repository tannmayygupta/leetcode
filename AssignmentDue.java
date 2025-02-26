import java.util.Scanner;

public class AssignmentDue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(Y-X >= 0){
		    System.out.print("yes");
		}
		else{
		    System.out.println("no");
		}
    }
}
