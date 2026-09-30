public class GradeSystem {
    public static void main(String[] args) {
        int grade = 76;
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 75) {
            System.out.println("Grade: B");
        } else if (grade >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
