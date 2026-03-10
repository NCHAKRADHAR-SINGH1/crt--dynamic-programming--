import java.util.Arrays;

public class DpMemoisation {
    static int dp[];
    static int fibD(int n){
        Arrays.fill(dp, -1);
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        dp[n]=fibD(n-1)+fibD(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        dp=new int[8];
        int fib=fibD(7);
        System.out.println(fib);
    }
}
