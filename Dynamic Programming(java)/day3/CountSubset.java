public class CountSubset {
    static int countSubsets(int nums[],int t){
        int n=nums.length;
        int dp[][]=new int[n+1][t+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=t;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][t];
    }
    public static void main(String[] args) {
        int nums[]={3,1,2};
        System.out.println(countSubsets(nums,3));
    }
}