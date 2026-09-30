public class InfiniteDemo {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("Count: " + count);
            count++;
            if(count > 4) {
                break;
            }
        }
        System.out.println("Loop stopped");
    }
}
