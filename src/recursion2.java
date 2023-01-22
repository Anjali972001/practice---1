import java.util.Scanner;
//Printing the fibonacci series.
public class recursion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the no of terms: ");
        int n=sc.nextInt();
        fibonacci(a,b,n);


    }
    static void fibonacci(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }
}
