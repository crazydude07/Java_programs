import java.util.Scanner;

public class Arthmetic {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System .out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Addition = " + (a + b));
        scanner.close();
        
     }
}

