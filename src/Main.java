import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter customer type (Premium/Gold/Silver/Normal): ");
            String customerType = scanner.nextLine();
            System.out.print("Enter sale date (DD-MM-YYYY): ");
            String saleDate = scanner.nextLine();
            Customer customer = new Customer(customerName, customerType);
            Sale sale = new Sale(customer, saleDate);
            System.out.print("Enter service expense: ");
            double serviceExpense = scanner.nextDouble();
            System.out.print("Enter product expense: ");
            double productExpense = scanner.nextDouble();
            scanner.nextLine();
            sale.setServiceExpense(serviceExpense);
            sale.setProductExpense(productExpense);
            sale.displayInfo();
            System.out.print("Do you want to enter another sale? (yes/no): ");
            choice = scanner.nextLine();
        } while(choice.equalsIgnoreCase("yes"));

        scanner.close();*/

        Customer customer1 = new Customer("Meng Leang", "Premium");
        Customer customer2 = new Customer("Lim Hong", "Gold");
        Customer customer3 = new Customer("Vea Sna", "Silver");
        Customer customer4 = new Customer("Chan", "Normal");

        Sale sale1 = new Sale(customer1, "2024-02-20");
        sale1.setServiceExpense(100);
        sale1.setProductExpense(100);
        sale1.displayInfo();

        Sale sale2 = new Sale(customer2, "2024-02-20");
        sale2.setServiceExpense(100);
        sale2.setProductExpense(100);
        sale2.displayInfo();

        Sale sale3 = new Sale(customer3, "2024-02-20");
        sale3.setServiceExpense(100);
        sale3.setProductExpense(100);
        sale3.displayInfo();

        Sale sale4 = new Sale(customer4, "2024-02-20");
        sale4.setServiceExpense(100);
        sale4.setProductExpense(100);
        sale4.displayInfo();
    }
}
