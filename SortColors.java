public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};

        sortColors(arr);
        
    }
    public static void sortColors(int[] arr) {
        
        int temp = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int m = 0 ; m < arr.length ; m++){
            System.out.print(arr[m]);
        }
    }
}
