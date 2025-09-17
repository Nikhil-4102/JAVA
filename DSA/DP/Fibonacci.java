package DSA.DP;

public class Fibonacci {

    //recursion
    public static int fib_Recursion(int n ){
        if(n==0 || n==1){
            return n;
        }
        return fib_Recursion(n-1) + fib_Recursion(n-2);
    }

    //DP - Memorization
    public static int fib(int n , int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1,dp)+ fib(n-2, dp);
        return dp[n];
    }

    //DP - Tabulation
    public static int fib_tabu(int n , int dp[]){
        if(n==0 || n==1){
            return n ;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i < dp.length ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
     public static void main(String[] args) {
        int n = 7;
        int dp [] = new int[n+1];
        System.out.println(fib_Recursion(n));
        System.out.println(fib(n , dp));
        System.out.println(fib_tabu(n, dp));
     }
}
