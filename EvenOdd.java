import java.util.Scanner;
class EvenOdd 
{
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a Integer number"); 
       
       int num=sc.nextInt() ;

        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        } else {
            System.out.println("Entered Number is Odd");
            sc.close();
        }
    }
}
