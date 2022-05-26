//Program Uses Scanner
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        // create scanner to accept input
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        int Result;

        System.out.println("Enter First Number: "); //prompt
        number1 = input.nextInt();

        System.out.println("Enter Second Number: "); //prompt
        number2= input.nextInt();

        System.out.println("Enter Third Number: "); //prompt
        number3 = input.nextInt();

        Result= number1 * number2 * number3;

        System.out.printf("Result is %d%n", Result);
    }
}
