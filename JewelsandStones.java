public class JewelsandStones {
    public static void main(String[] args) {

        String jewels = "aA";

        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));

    }

    public static int numJewelsInStones(String jewels, String stones) {

        int cou = 0 ;

        for(int i = 0 ; i < jewels.length() ; i++){
            for(int j = 0 ; j < stones.length() ; j++){
                char ch = jewels.charAt(i);
                char st = stones.charAt(j);
                if(ch == st){
                    cou++;
                }
            }
        }
        return cou ;
    }

}
