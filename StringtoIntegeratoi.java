public class StringtoIntegeratoi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // String s = "  -c042   " ;

        String s = "04325x";

        // System.out.println(s.trim());

        // String[] s1 = s.trim().split("\\+s");

        // System.out.println(s1);

        String s1 = s.trim();

        char[] c = s1.toCharArray();

        int sign = 1 ;

        int firstint = 0 ;

        StringBuilder ans = new StringBuilder("");

        // find sign 
        // check sign is forst not after any integer 
        // after getting first char return the string we got

        int count = 0 ;


        for(int i = 0 ; i < c.length ; i++){

            char ch = Character.toLowerCase(c[i]);
            
            if( ch == '-'  && sign == 1){
                if(count == 0){
                    sign = -1 ;
                }
                else{
                    break ;
                }
            }
            else if( ch == '+'  && sign == 0){
                if(count == 0){
                    sign = -1 ;
                }
                else{
                    break ;
                }
            }
            else if(ch >= 97 && ch <= 122){
                break;
            }
            else if((ch >= 48 && ch <= 57)){
                ans.append(ch);
                count++;
            }
        }

        if(ans.length() == 0){
            // return 0 ;
            System.out.println(0);
        }
        else{
            String str = ans.toString();
            int intValue = Integer.parseInt(str);
            System.out.println(intValue * sign);
        }




    }
}
