public class EqualPartition {
    static boolean equalPartition(int nums[],int t){
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][t+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
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
        int nums[]={3,5,5,2};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            System.out.println("false");
            return;
        }
        boolean ans=equalPartition(nums,sum/2);
        System.out.println(ans );
    }
}