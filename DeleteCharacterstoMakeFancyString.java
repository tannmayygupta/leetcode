public class DeleteCharacterstoMakeFancyString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(makeFancyString(s));
    }
    public static String makeFancyString(String s) {
        
        char charprev = s.charAt(0);

        int charcou = 1 ;
        
        StringBuilder ans = new StringBuilder();

        ans.append(s.charAt(0));

        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == charprev){
                charcou++;
            }
            else{
                charprev = s.charAt(i);
                charcou = 1 ;
            }

            if(charcou < 3){
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    // kuch toh hagga

    // public static String makeFancyString(String s) {

    //     StringBuilder ans = new StringBuilder();

    //     for(int i = 0 ; i < s.length() ; i++){
    //         if(i < 2){
    //             ans.append(s.charAt(i));
    //         }

    //         int l = ans.length();

    //         if(l >= 2 && !(ans.charAt(l-1) == s.charAt(i) && s.charAt(i) == ans.charAt(l-2))){
    //             ans.append(s.charAt(i));
    //         }
    //     }

    //     return ans.toString();
    // }
}
