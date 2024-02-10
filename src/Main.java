import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double SHIPPING_RATE = 0.02;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = " ";

        System.out.print("Enter the item Price: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100) {
                totalPrice = itemPrice;
                System.out.println("The total price is " + totalPrice);

            } else {
                shippingCost = itemPrice * SHIPPING_RATE;
                totalPrice = shippingCost + itemPrice;
                System.out.println("The shipping cost and total price are " + shippingCost + " , " + totalPrice);
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Try again");
        }




    }


}