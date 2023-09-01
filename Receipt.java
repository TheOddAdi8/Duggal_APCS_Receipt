// Receipt.java
import java.util.Scanner;

public class Receipt {
    
    public static void main(String[] args) {

        Scanner orderBot = new Scanner(System.in);

        int milk = -1;
        double eggs = -1;
        int O2 = -1;

        System.out.println("");
        System.out.println("Welcome to Adi's Convience Store!");
        System.out.println("We offer a wide selection of products.");
        System.out.println("");

        System.out.print("Enter how many gallons of milk you want: ");
        while(milk < 0) {
            milk = orderBot.nextInt();
        }

        System.out.print("Enter how many eggs you want (decimals allowed): ");
        while(eggs < 0) {
            eggs = orderBot.nextDouble();
        }

        System.out.print("Enter how many Liters of O2 do you want: ");
        while(O2 < 0) {
            O2 = orderBot.nextInt();
        }



        orderBot.close();

    }
}
