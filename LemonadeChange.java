public class LemonadeChange{
    public static void main(String[] args){
        int[] lemon = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        System.out.println(lemonadeChange(lemon));
    }

    public static boolean lemonadeChange(int[] bills) {
        int cou5 = 0 ;
        int cou10 = 0 ;
        // 5 5 5 10 10 20
        for(int i = 0 ; i < bills.length ; i++){

            if(bills[i] == 5){
                cou5++;
            }

            if(bills[i] == 10){
                cou10++;
                if(cou5 > 0){
                    cou5--;
                }
                else{
                    return false ;
                }
            }

            if(bills[i] == 20){
                if(cou5 > 0 && cou10 > 0){
                    cou5--;
                    cou10--;
                }
                else if(cou5 > 2){
                    // return false ;
                    cou5= cou5 - 3 ;
                }
                else{
                    return false ;
                }
            }
        }

        return true ;
    }
}