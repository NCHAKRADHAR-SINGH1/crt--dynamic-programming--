public class LongestIncreasingSubssequence {
    static int lengthOfLIS(int nums[]){
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++) dp[i]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(dp[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,6,8,0};
        System.out.println(lengthOfLIS(arr));
    }
}
