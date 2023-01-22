import java.util.Scanner;
// printing the number from the entered  number to zero.
public class recursion3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println( print( n));
    }
    static int print(int n)
    {
       if(n==0)
       {
           return 0;
       }
        System.out.println(n);
       return print(n-1);
    }
}
