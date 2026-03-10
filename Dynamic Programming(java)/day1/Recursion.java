import java.util.Scanner;

public class Recursion{
    static int factR(int n){
        if(n==1)
            return 1;
        return n*factR(n-1);
    }
    static int fibR(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibR(n-1)+fibR(n-2);
    }
    static int triR(int n){
        if(n==0)
            return 0;
        if(n==1 ||n==2)
            return 1;
        return triR(n-1)+triR(n-2)+triR(n-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(n<4){
            System.out.println("========================================================");
            System.out.println("Select:\n1-factorial,\n2-fibanocci,\n3-tribanocci,\n4-Exit.");
            System.out.println("========================================================");

        n=sc.nextInt();
        switch (n) {
        case 1:
            System.out.println("Enter any number for factorial:");
            int fact=sc.nextInt();
            System.out.println("Factorial of"+ fact+":"+factR(fact));
        break;
        case 2:
        System.out.println("Enter any number for fibanocci:");
        int fib=sc.nextInt();
        System.out.println("Fibanocci of"+ fib+":"+fibR(fib));
        break;
        case 3:
            
            System.out.println("Enter any number for tribanocci:");
            int trib=sc.nextInt();
            System.out.println("Tribanocci of"+ trib+":"+triR(trib));
            break;
        case 4:
            System.out.println("exiting the loop................................");
            break;
        default:
            System.out.println("enter only the above number.");
            break;
        }
    }
        sc.close();
    }
}