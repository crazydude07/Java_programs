public class Constructer {
    private String name;
    private int age;

    // Constructor
    public Constructer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
