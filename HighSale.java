import java.util.Scanner;

public class HighSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sales = new double[7];

        System.out.println("Enter sales for 7 days:");
        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextDouble();
        }

        double max = sales[0];
        int day = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
                day = i;
            }
        }

        System.out.printf("Highest sale = %.2f%n", max);
        System.out.println("Occurred on day " + (day + 1));
        sc.close();
    }
}

    
