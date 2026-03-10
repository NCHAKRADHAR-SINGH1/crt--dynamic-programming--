public class FibSpaceEfficient {
    static int fib(int n){
        int prev2=0;
        int prev1=1;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int fib=fib(7);
        System.out.println(fib);
    }
}
