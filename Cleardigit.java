public class Cleardigit {
    public static void main(String[] args) {

        String s = "cb34";
        int n = s.length();
        char[] arr = new char[n];

        int tos = -1 ;

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i) ;
            if(Character.isDigit(ch)){
                tos = pop(tos , arr);
            }
            else{
                tos = push(ch , tos , arr);
            }
        }

        if(tos == -1){
            System.out.println("");
        }
        else{
            // for(int i = 0 ; i <= tos ; i++){
            //     System.out.println(arr[i]);
            // }
            StringBuilder sb = new StringBuilder();
            sb.append(arr);
            String str = sb.toString();
            System.out.println(str);
            // return str ;
        }
    }

    static int pop(int tos , char[] arr) {
        if (tos == -1) {
            return -1 ;
        } 
        else {
            return tos - 1;
        }
    }

    static int push(char value , int tos , char[] arr) {
        int n =  arr.length ;
        if (tos == n - 1) {
            return tos ;
        } 
        else{
            tos++;
            arr[tos] = value;
        }
        return tos ;
    }
}
