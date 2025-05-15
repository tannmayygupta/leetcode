public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int a = area(height);

        System.out.println(a);
        
    }
    public static int area(int[] height){

        int area = Integer.MIN_VALUE ;
        int bre = Integer.MAX_VALUE ;

        if(height.length == 1){
            return 0 ;
        }

        for(int i = 0 ; i < height.length - 1 ; i++){
            for(int j = i + 1 ; j < height.length ; j++){
                int len = (j) - (i);
                bre = Math.min(height[i] , height[j]);
                int area1 = len * bre ;
                area = Math.max(area,area1);
            }
        }

        return area ;
    }
}
