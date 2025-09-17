package DSA.DP;

public class ClimbingStairs {

    //dp-memorization
    public static int countWays(int steps , int dp[]){

        if( steps == 0 || steps == 1 ){
            return 1;
        }
        if(steps < 0){
            return 0 ;
        }
        if(dp[steps] != 0){
            return dp[steps];
        }
        dp[steps] = countWays(steps-1 , dp) + countWays(steps-2 , dp);
        return dp[steps];

    }
    
    public static void main(String[] args) {
        
        int steps = 5;
        int dp[] = new int[steps+1];
        System.out.println(countWays(steps , dp));
    }
}
