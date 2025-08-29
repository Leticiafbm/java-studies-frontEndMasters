package loops;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items you would like to scan:");
        int quantitiy = scanner.nextInt();


        double total = 0;

        for(int i = 0;  i < quantitiy; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();
        System.out.println("Your total is: " + total);
    }
}
