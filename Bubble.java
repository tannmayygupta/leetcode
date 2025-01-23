public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,8,7,1};
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
        for(int a = 0 ; a < arr.length ; a++){
            System.err.println(arr[a]);
        }
    }
}
