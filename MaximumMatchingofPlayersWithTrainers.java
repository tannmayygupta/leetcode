import java.util.Arrays;
// 2410. Maximum Matching of Players With Trainers
// https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/

public class MaximumMatchingofPlayersWithTrainers {
    public static void main(String[] args) {

        int[] player = {4,7,9};

        int[] trainers = {8,2,5,8};

        System.out.println(matchPlayersAndTrainers(player, trainers));
        
    }
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);

        Arrays.sort(trainers);

        int p1 = 0 ;
        int t1 = 0 ;

        int cou = 0 ;
        while(p1 < players.length && t1 < trainers.length){
            if(players[p1] <= trainers[t1]){
                cou++;
                p1++;
                t1++;
            }
            else{
                t1++;
            }
        }

        return cou ;
        
    }
}
