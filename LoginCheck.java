public class LoginCheck {
    public static void main(String[] args) {
        String username = "admin";
        int pin = 1234;
        if (username.equals("admin") && pin == 1234) {
            System.out.println("Acess granted");
        } else {
            System.out.println("Wrong pin.");
        }
        System.out.println("Unknown username.");
    }
}