import java.util.*;

public class NumberofWaystoBuyPensandPencils {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 20 ;

        int cost1 = 10 ;

        int cost2 = 5 ;
        
        long mam = 0 ;

        mam += (total / cost2 ) + 1 ;
        
        while(total > 0){
            total = total - cost1 ;

            if(total < 0 ){
                break ;
            }

            else if(total == 0){
                mam += 1 ;
                break;
            }
            
            mam += (total / cost2 ) + 1 ;

        }

        System.out.println(mam);

    }


}
