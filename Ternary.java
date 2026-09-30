import java.util.Scanner; 
public class Ternary{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter marks: ");
     int marks = sc.nextInt();
     String result = (marks >= 35) ? "Pass" : "Fail";
     System.out.println(result);
     sc.close();
    }       
}   