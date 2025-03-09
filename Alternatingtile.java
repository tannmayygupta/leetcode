public class Alternatingtile {
    public static void main(String[] args) {
        int[] colors = {0,1,0,1,0};
        int k = 3 ;
        // int n = colors.length ;
        // int[] cir = new int[n + k];

        // for(int i = 0 ; i < colors.length ; i++){
        //     cir[i] = colors[i];
        // }

        // for(int i = 0 ; i < k ; i++){
        //     cir[n+i] = colors[i];
        // }

        // for(int i = 0 ; i < cir.length  ; i++){
        //     System.out.println(cir[i]);
        // }

        int m = numberOfAlternatingGroups(colors, k);

        System.out.println(m);

    }

        public static int numberOfAlternatingGroups(int[] colors, int k) {
            int n = colors.length;
            int[] cir = new int[n + k - 1];
    
            if(n==1){
                return 0 ;
            }
    
            if(k == 1){
                return n ;
            }
    
            for (int i = 0; i < colors.length; i++) {
                cir[i] = colors[i];
            }
    
            for (int i = 0; i < k - 1; i++) {
                cir[n + i] = colors[i];
            }
    
            // for(int i = 0 ; i < cir.length ; i++){
            // System.out.println(cir[i]);
            // }
    
            int count = 0;
    
            for (int i = 0; i < n ; i++) {
                int flag = 0;
                for (int j = i + 1 ; j < i + k - 1 ; j++) {
                    // int left = i;
                    // int right = i + k;
                    // int mid = (left + right) / 2;
    
                    if (cir[j] == cir[j + 1] || cir[j] == cir[j - 1]) {
                        flag = 1;
                        break ;
                    }
    
                }
                if (flag == 0) {
                    count++;
                }
            }
    
            return count ;
        }
}
