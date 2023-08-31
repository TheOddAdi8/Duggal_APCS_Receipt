// Receipt.java
import java.util.Scanner;

public class Receipt {
    
    public static void main(String[] args) {

        Scanner NameBot = new Scanner(System.in);
        Scanner AgeBot = new Scanner(System.in);
        
        System.out.println("");

        System.out.print("Enter your name: ");

        String name = NameBot.nextLine();

        System.out.print("Now enter your age: ");

        int age = AgeBot.nextInt();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

    }
}
