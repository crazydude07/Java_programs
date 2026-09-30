class MainCalculator {
int add(int a, int b){
    return a + b;
}
int add(int a, int b, int c){
    return a + b + c;
}
double add(double a, double b){
    return a + b;
   }
}
public class Calculator extends MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println(calc.add(5.5, 10.5)); // Calls add(double, double)
    }
}