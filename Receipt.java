// Receipt.java
import java.util.Scanner;

public class Receipt {
    
    public static void main(String[] args) {

        Scanner orderBot = new Scanner(System.in);

        int milk;
        double eggs;

        System.out.println("Welcome to Adi's Convience Store!");
        System.out.println("We offer a wide selection of products.");

        System.out.print("Enter how many gallons of milk you want: ");
        milk = orderBot.nextInt();
        System.out.print("Enter how many eggs you want (decimals allowed): ");
        eggs = orderBot.nextDouble();


        orderBot.close();

    }
}
