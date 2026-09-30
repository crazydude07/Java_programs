import java.util.Scanner;

public class ElectricityUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] units = new int[10];
        int count = 0;

        System.out.println("Enter electricity usage for 10 days:");
        for (int i = 0; i < units.length; i++) {
            units[i] = sc.nextInt();
            if (units[i] > 20) {
                count++;
            }
        }

        System.out.println("High-usage days = " + count);
        sc.close();
    }
}

