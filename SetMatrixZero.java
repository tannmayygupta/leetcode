public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int index = 0 ;
        int jx = 0 ;
        int n = arr.length ;
        int m = arr[0].length ;
        int[][] arr1 = new int[n][m];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j<arr[i].length;j++){
                arr1[i][j] = arr[i][j];
            }
        }

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr1[i].length ; j++){
                // System.out.print(arr[i][j]+" ");
                if(arr1[i][j] == 0){
                    index = i ; //1
                    jx = j ; //1
                    for(int l = 0; l < arr.length ; l++){
                        for(int q = 0 ; q < arr[l].length;q++){
                                arr[index][q] = 0 ;
                        }
                    }   
                    for(int k = 0 ; k < arr.length ; k++){
                        arr[k][jx] = 0 ;
                    }
                }
            }
        }
        // for(int i = 0 ; i < arr.length ; i++){
        //     for(int j = 0 ; j < arr[i].length ; j++){
        //         // System.out.print(arr[i][j]+" ");
        //         if(arr[i][j] == 0){
        //             index = i ; //1
        //             jx = j ; //1
        //         }
        //     }
        // }
        // setMatrix(arr, index, jx);

        // System.err.println(index+" "+jx);
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
        }

    }
    // static void setMatrix(int[][] arr , int index , int jx){
    //     for(int l = 0; l < arr.length ; l++){
    //         for(int m = 0 ; m < arr[l].length;m++){
    //                 arr[index][m] = 0 ;
    //         }
    //     }   
    //     for(int i = 0 ; i < arr.length ; i++){
    //         arr[i][jx] = 0 ;
    //     }
    // }
}