package DSA.DP;

public class Knapsack_0_1 {
    
    // DP - recursion
    public static int knapsack(int val[] , int wt[], int W , int n){
        if(W == 0 || n==0) return 0;

        if(wt[n-1] <= W ){
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);
            int ans2 = knapsack(val, wt, W, n-1);
            return Math.max(ans1,ans2);
        }else{
            return knapsack(val, wt, W, n-1);
        }
    }

    // DP - memorization
    public static int knapsack(int val[] , int wt[] , int W , int n , int dp[][]){
        for(int i = 0 ; i<dp.length;i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                    dp[i][j] = -1;
            }
        }

        if(n==0 || W == 0) return 0;

        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){
           int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);
           int ans2 = knapsack(val, wt, W, n-1);
           dp[n][W] = Math.max(ans1, ans2);
           return dp[n][W];
        }else{
           dp[n][W] = knapsack(val, wt, W, n-1);
           return dp[n][W];
        }
    }

    //DP- Tabulation
    public static int kanpsack_Tabalu(int val[], int wt[], int W, int n){
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0 ;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1 ; j++) {
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){
                    int IncProfit = v + dp[i-1][j-w];
                    int ExcProfit = dp[i-1][j];
                    dp[i][j] = Math.max(IncProfit,ExcProfit);
                }else{
                    dp[i][j] = dp[i-1][j];

                }
            }
        }
        return dp[n][W];
    }
    
    public static void main(String[] args) {
        int  val[] = {15,14,10,45,30};
        int wt [] = {2,5,1,3,4};
        int n = val.length;
        int W = 7 ;
        int dp[][] = new int[n+1][W+1];
        System.out.println("Recursion : "+knapsack(val, wt , W , n));
        System.out.println("DP-Memorization : "+knapsack(val, wt , W , n ,dp));
        System.out.println("DP -Tabulation : "+kanpsack_Tabalu(val, wt, W, n));
    }
}
