public class AddString {
    public static void main(String[] args) {
        
    }
    public static String AddString(String num1 , String num2){
        StringBuilder s = new StringBuilder("");

        int carry = 0 ; 
        int p1 = num1.length() -1 ;
        int p2 = num2.length() - 1 ;

        while(p1>= 0 && p2 >= 0){
            int n1 = Integer.parseInt(Character.toString(s.charAt(p1)));

            int n2 = Integer.parseInt(Character.toString(s.charAt(p2)));

            int sum = n1 + n2 + carry ;

            if(sum < 10){
                s.append(sum);
                carry = 0 ;
            }
            else{
                s.append(sum% 10);
                carry = sum / 10 ;
            }
            p1--;
            p2--;
        }

        while(p1>= 0){
            int n1 = Integer.parseInt(Character.toString(s.charAt(p1)));


            int sum = n1 + carry ;

            if(sum < 10){
                s.append(sum);
                carry = 0 ;
            }
            else{
                s.append(sum% 10);
                carry = sum / 10 ;
            }
            p1--;
        }

        while(p2>= 0){
            int n1 = Integer.parseInt(Character.toString(s.charAt(p2)));


            int sum = n1 + carry ;

            if(sum < 10){
                s.append(sum);
                carry = 0 ;
            }
            else{
                s.append(sum% 10);
                carry = sum / 10 ;
            }
            p2--;
        }

        if(carry >= 1){
            s.append(carry);
        }

        return s.reverse().toString();
    }
}
