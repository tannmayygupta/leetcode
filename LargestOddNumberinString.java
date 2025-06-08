public class LargestOddNumberinString {
    public static void main(String[] args) {
        String num = "TanmayGupta";

        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {

        for(int i = num.length() - 1 ; i >= 0 ; i--){
            int c = Integer.valueOf(num.charAt(i));

            if(c % 2 == 1){
                return num.substring(0,i+1);
            }
        }

        return "";

    }
}
