import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascaltriangle {
    public static void main(String[] args) {
        // List<Integer> preList = new ArrayList<Integer>();
        // List<Integer> list = new ArrayList<Integer>();

        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1

        Scanner sc = new Scanner(System.in);

        int numRow = sc.nextInt();

        List<List<Integer>> pascaltriangle = new ArrayList<>();

        for(int i = 0 ; i < numRow ; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int value = pascaltriangle.get(i-1).get(j-1) + pascaltriangle.get(i-1).get(j) ;
                    row.add(value);
                }
            }
            pascaltriangle.add(row);
        }

        System.out.println(pascaltriangle);
        // for(int i = 0 ; i <= numRow ; i++){
        //     List<Integer> row = new ArrayList<Integer>();
        //     List<Integer> preRow = new ArrayList<Integer>();
        //     for(int j = 0 ; j <= i ; j++){
        //         if(j == 0 || j == i){
        //             row.add(1);
        //         }
        //         else{
        //             row.add(preRow.get(j-1)+ preRow.get(j-1));
        //         }
        //     }
        //     preRow.add(row);
        //     Pascaltriangle.add(row);
        // }

        // return Pascaltriangle ;
        
        

    }
}
