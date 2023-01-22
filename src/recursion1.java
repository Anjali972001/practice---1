import java.util.Scanner;
// printing the factorial.
class recursion1
{

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("factorial of the given number is: ");
        System.out.println(factorial(n));
    }
    public static int factorial(int n)
    {
      if(n==0)
      {
          return 1;
      }

       return n * factorial(n-1);


    }
}