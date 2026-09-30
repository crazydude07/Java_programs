import java.util.Scanner;

public class ParcelWeight {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter the weight of the parcel in kg: ");
            double weight = sc.nextDouble();
            if(weight <= 0){
                throw new IllegalArgumentException("Weight must be a positive number.");
            }
            System.out.println("The weight of the parcel is: " + weight + " kg");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
           System.out.println("Weight checking completed.");
            sc.close();
        }
    }
}