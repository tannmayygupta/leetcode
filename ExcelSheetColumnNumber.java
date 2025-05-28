import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String columnTitle = sc.nextLine();

        System.out.println(titleToNumber(columnTitle));
        
    }
    public static int titleToNumber(String columnTitle) {
            int end = columnTitle.length() - 1 ;
            int colNum = 0 ;
            int cou = 0 ;
            while(end >= 0){
                int c = columnTitle.charAt(end);
                int s = Math.abs(90 - c - 26);
                
                colNum += Math.pow(26,cou) * s ;

                cou++;
                end--;
            }

            return colNum ;
    }
}
