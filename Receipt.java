// Receipt.java
import java.util.Scanner;

public class Receipt {
    
    public static void main(String[] args) {

        Scanner orderBot = new Scanner(System.in);

        int milk = -1;
        double eggs = -1;
        int O2 = -1;
        int H2 = -1;

        System.out.println("");
        System.out.println("Welcome to Adi's Convience Store!");
        System.out.println("We offer a wide selection of products.");

        System.out.println("");
        System.out.print("Enter how many gallons of milk you want: ");
        while(milk < 0) {
            milk = orderBot.nextInt();
        }

        System.out.println("");
        System.out.print("Enter how many eggs you want (decimals allowed): ");
        while(eggs < 0) {
            eggs = orderBot.nextDouble();
        }

        System.out.println("");
        System.out.print("Enter how many moles (6.02 x 10^23 molecules)(1 mole of O2 is about 32 grams) of oxygen (O2) you want: ");
        while(O2 < 0) {
            O2 = orderBot.nextInt();
        }

        System.out.println("");
        System.out.println("We don't sell water, so you can buy the Hydrogen individually.");
        System.out.print("Enter how many moles (6.02 x 10^23 molecules)(1 mole of H2 is about 2 grams) of hydrogen (H2) you want: ");
        while(H2 < 0) {
            H2 = orderBot.nextInt();
        }

        //Calculate payment values

        final double MILKPRICE = 9.99;
        final double EGGS = 0.49

        


        orderBot.close();

    }
}
