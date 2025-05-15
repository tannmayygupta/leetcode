public class ContainerWithMostWaterOptimized {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int a = area(height);

        System.out.println(a);
        
    }
    public static int area(int[] height){

        int left = 0 ;

        int right = height.length - 1;

        int area = Integer.MIN_VALUE;

        int bre = Integer.MAX_VALUE;

        while(left < right){

            int len = (right) - (left);
        
            bre = Math.min(height[left] , height[right]);
        
            int area1 = len * bre ;
        
            area = Math.max(area,area1);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }

        return area ;
    }
}

