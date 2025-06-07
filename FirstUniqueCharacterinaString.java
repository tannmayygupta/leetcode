public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "Samiksha" ;
        System.out.println(s);
        
    }
    public static char repeatedCharacter(String s) {
        int[] arr = new int[26];

        for(int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            int j = c - 'a';

            if(arr[j] == 1){
                return c ;
            }
            else{
                arr[j]++;
            }
        }

        return 0 ;
    }
}
