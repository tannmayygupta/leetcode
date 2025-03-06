import java.util.Arrays;

public class FindMissingandRepeatedValues {
    public static void main(String[] args) {

            int grid[][] = {{9,1,7},{8,9,2},{3,4,6}}; 
    
            int n = grid.length ;
            int arr[] = new int[n*n];
            int index = 0 ;
    
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    arr[index++] = grid[i][j] ; 
                }
            }
    
            Arrays.sort(arr);
            
            // for(int i = 0 ; i < arr.length ; i++){
            //     System.out.println(arr[i]);
            // }
    
            int idx = -1 ;
            int p = -1 ;
    
            for(int i = 0 ; i < arr.length - 1 ; i++){
                if(arr[i] == arr[i+1]){
                    idx = i ;
    
                }
                else if( (arr[i] + 1) != arr[i+1]){
                    p = arr[i] + 1  ;
                }
            }
    
            if(p == -1 && arr[0] == 1 ){
                p = arr.length ;
            }
            else if(p == -1 && arr[0] != 1){
                p = 1 ;
            }
    
            // return new int[] {arr[idx] , p} ;
            System.out.println(arr[idx]+" "+p);
    }
}