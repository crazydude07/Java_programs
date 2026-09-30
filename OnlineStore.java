import java.util.ArrayList;
import java.util.Scanner;

class Item {

    int id;
    String name;
    double price;
    int stock;

    Item(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

public class OnlineStore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Item> cart = new ArrayList<>();

        boolean paymentDone = false;

        // Store products
        items.add(new Item(1, "Laptop", 50000, 5));
        items.add(new Item(2, "Headphones", 2000, 10));
        items.add(new Item(3, "Keyboard", 1500, 8));
        items.add(new Item(4, "Mouse", 800, 15));
        items.add(new Item(5, "Mobile Phone", 20000, 3));

        // Keep program running
        while (true) {

            System.out.println("\n===== ONLINE STORE =====");
            System.out.println("1. Browse Items");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Payment Status");
            System.out.println("6. Order Tracking");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // Browse items
                case 1:

                    System.out.println(
                        "\n===== AVAILABLE ITEMS ====="
                    );

                    for (Item item : items) {

                        System.out.println("ID: " + item.id);
                        System.out.println(
                            "Name: " + item.name
                        );
                        System.out.println(
                            "Price: Rs. " + item.price
                        );
                        System.out.println(
                            "Stock: " + item.stock
                        );

                        System.out.println(
                            "----------------------"
                        );
                    }

                    break;

                // Add to cart
                case 2:

                    System.out.print(
                        "Enter Item ID: "
                    );

                    int itemId = sc.nextInt();

                    boolean found = false;

                    for (Item item : items) {

                        if (item.id == itemId) {

                            found = true;

                            // Check stock
                            if (item.stock > 0) {

                                cart.add(item);
                                item.stock--;

                                System.out.println(
                                    item.name +
                                    " added to cart!"
                                );

                            } else {

                                System.out.println(
                                    "Sorry! Item is out of stock."
                                );
                            }

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println(
                            "Item not found!"
                        );
                    }

                    break;

                // View cart
                case 3:

                    if (cart.size() == 0) {

                        System.out.println(
                            "Your cart is empty."
                        );

                    } else {

                        System.out.println(
                            "\n===== YOUR CART ====="
                        );

                        for (Item item : cart) {

                            System.out.println(
                                item.name +
                                " - Rs. " +
                                item.price
                            );
                        }
                    }

                    break;

                // Checkout
                case 4:

                    if (cart.size() == 0) {

                        System.out.println(
                            "Your cart is empty."
                        );

                    } else {

                        double total = 0;

                        System.out.println(
                            "\n===== BILL ====="
                        );

                        for (Item item : cart) {

                            System.out.println(
                                item.name +
                                " - Rs. " +
                                item.price
                            );

                            total = total + item.price;
                        }

                        System.out.println(
                            "----------------------"
                        );

                        System.out.println(
                            "Total: Rs. " + total
                        );

                        System.out.println(
                            "Order placed successfully!"
                        );
                    }

                    break;

                // Payment status
                case 5:

                    if (cart.size() == 0) {

                        System.out.println(
                            "No order available."
                        );

                    } else {

                        paymentDone = true;

                        System.out.println(
                            "Payment successful!"
                        );
                    }

                    break;

                // Order tracking
                case 6:

                    if (!paymentDone) {

                        System.out.println(
                            "Please complete payment first."
                        );

                    } else {

                        System.out.println(
                            "Order Status: Confirmed"
                        );

                        System.out.println(
                            "Order Status: Packed"
                        );

                        System.out.println(
                            "Order Status: Shipped"
                        );

                        System.out.println(
                            "Order Status: Out for Delivery"
                        );

                        System.out.println(
                            "Order Status: Delivered"
                        );
                    }

                    break;

                // Exit
                case 7:

                    System.out.println(
                        "Thank you for shopping!"
                    );

                    sc.close();
                    return;

                default:

                    System.out.println(
                        "Invalid choice!"
                    );
            }
        }
    }
}