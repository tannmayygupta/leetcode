import java.util.ArrayList;

import java.util.List;

import java.util.*;


public class PascalTriangleII {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rowIndex = sc.nextInt();

        System.out.println(getRow(rowIndex));


    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascaltriangle = new ArrayList<>();
        
        if (rowIndex < 0) {
            return new ArrayList<>();
        }
        
        for (int i = 0; i <= rowIndex; i++) {  
            
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int value = pascaltriangle.get(i - 1).get(j - 1) + pascaltriangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            pascaltriangle.add(row);
        }
        
        return pascaltriangle.get(rowIndex);
    }
}

