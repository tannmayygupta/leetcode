public class Union {


    public static void main(String[] args) {
        int arr1[] = {1,1,2,3};
        int arr2[] = {1,1,3,6};
        
        int n = arr1.length + arr2.length ;

        int pre = 0 ;

        int[] arr3 = new int[n];
        int i = 0 ;
        while(i<arr1.length){
            if(arr1[i] == arr2[i]){
                if(pre != arr1[i] ){
                    arr3[i] = arr1[i];
                    pre = arr1[i] ;
                }
            }
            else if(arr1[i] > arr2[i]){
                if(pre != arr2[i]){
                    arr3[i] = arr2[i];
                    pre = arr2[i] ;
                }
            }
            else if(arr1[i] < arr2[i]){
                if(pre != arr1[i]){
                    arr3[i] = arr1[i];
                    pre = arr1[i];
                }
            }
        }

        for(int j = 0 ; j < arr3.length ; j++){
            System.err.print(arr3[j]);
        }
    }
}

// unique element in array 

// int i = 0 ;
// int index = 0 ;
// int count = 0;
// Arrays.sort(nums);
// while(i<nums.length - 1){
//  if(nums[i] != nums[i + 1] ){
//      if(count == 0){
//          index = i;
//      }
//      else{
//          count=0;
//      }
//  }
//  else{
//      count++;
//  }
//  i++;
// }
// return nums[index];
// }
// }
