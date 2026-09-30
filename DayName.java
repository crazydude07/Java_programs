public class DayName {
    public static void main(String[] args) {
        int day = 4;
        String name;

        switch (day) {
            case 1: name = "Monday";
                break;
            case 2: name = "Tuesday";
                break;
            case 3: name = "Wednesday";
                break;
            case 4: name = "Thursday";
                break;
            case 5: name = "Friday";
                break;
            default: name = "Weekend";
                break;
        }
        System.out.println("Day: " + name);
    }
}
