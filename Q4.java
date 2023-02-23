import java.util.ArrayList;
import java.util.Scanner;
public class Q4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter order ID: ");
            int orderId = scanner.nextInt();

            ArrayList<Items> items = new ArrayList<Items>();
            while (true) {
                System.out.print("Enter item ID (0 = exit): ");
                int itemId = scanner.nextInt();

                if (itemId == 0) {
                    break;
                }
                System.out.print("Enter item name: ");
                String itemName = scanner.next();

                System.out.print("Enter item price: ");
                double itemPrice = scanner.nextDouble();

                Items item = new Items(itemId, itemName, itemPrice);
                items.add(item);
            }

            Order order = new Order(orderId, items);
            double averageCost = order.calculateAverageCost();

            System.out.println("Average cost: " + averageCost);
        }
}

