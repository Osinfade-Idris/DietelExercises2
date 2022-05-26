//Program Uses Scanner
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        // create scanner to accept input
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Enter First Number: "); //prompt
        number1=input.nextInt();

        System.out.println("Enter Second Number: "); //prompt
        number2=input.nextInt();

        sum= number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}
