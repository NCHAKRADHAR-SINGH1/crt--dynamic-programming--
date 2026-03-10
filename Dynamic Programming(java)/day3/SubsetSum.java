public class SubsetSum {
    static boolean subsetSum(int nums[],int t){
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][t+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=t;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
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
        System.out.println(subsetSum(nums,3));
    }
}