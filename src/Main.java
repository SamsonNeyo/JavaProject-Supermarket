//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


                Date date = new Date();

                Scanner scanner = new Scanner(System.in);

                System.out.println("_______________________________ ");

                System.out.println("Horanna Supermarket:");
                System.out.println("Email: horannosupermarket@gmail.com, Tel: +256783833904:");
                System.out.println("----------------------------------");

                System.out.println("Enter customer name:");
                String cname=scanner.nextLine();

                System.out.println("Enter the seller name:");
                String name=scanner.nextLine();

                System.out.println("Enter the first item1:");
                String item1=scanner.nextLine();

                System.out.println("Enter the price:");
                double price1 =scanner.nextInt();

                System.out.println("Enter the quantity:");
                double quantity1=scanner.nextInt();

                double cost1 = price1 * quantity1;

                scanner = new Scanner(System.in);

                System.out.println("_______________________________ ");

                System.out.println("Enter the second item2:");
                String item2=scanner.nextLine();

                System.out.println("Enter the price2:");
                double price2 =scanner.nextInt();

                System.out.println("Enter the quantity2:");
                double quantity2=scanner.nextInt();


                double cost2 = price2 * quantity2;

                double total=cost1+cost2;

                System.out.println("Enter the amount you wanna pay:");
                double amountpaid=scanner.nextInt();

                double balance = amountpaid-total;

                System.out.println("________________________________________");
                System.out.println("Thanks you for shopping with us "+cname);
                System.out.println("You have been served by "+name);
                System.out.println("You have paid "+amountpaid +" Ugx");
                System.err.println("Total cost: "+total);
                System.out.println("Your balance is "+balance +" Ugx");
                System.out.println("Time: "+date);
                


    }
}