public class Countdown {
    static void countdown(int n) {
 if (n == 0) {
 return;
 }
 System.out.println(n);
 countdown(n - 1);
 }
 public static void main(String[] args) {
 countdown(10);
 }
}
