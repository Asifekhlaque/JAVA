package projectjava;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductFileHandler {
    public static void main(String[] args) {
        int numOfProducts = 3;
        String filename = "products.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Scanner scanner = new Scanner(System.in);
            for (int i = 1; i <= numOfProducts; i++) {
                System.out.println("Enter details for Product " + i + ":");
                System.out.print("Product name: ");
                String productName = scanner.nextLine();
                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.print("Price: ");
                double price = Double.parseDouble(scanner.nextLine());
                // Write product details to the file
                bufferedWriter.write("Product: " + productName + ", Quantity: " + quantity + ", Price: " + price + "\n");
            }
            bufferedWriter.close();
            System.out.println("Data written to " + filename + " successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}