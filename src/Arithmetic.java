import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        int sum;
        int product;
        int difference;
        float division;

        System.out.println("Enter The First Number");
        number1 = input.nextInt();

        System.out.println("Enter The Second Number");
        number2 = input.nextInt();

        sum = number1 + number2;

        product = number1 * number2;

        difference = number1 - number2;

        division = number1 / number2;

        System.out.printf("The Sum is = %d%n", sum);

        System.out.printf("The Product is = %d%n", product);

        System.out.printf("The Difference is = %d%n", difference);

        System.out.printf("The quotient is = %f%n", division);
    }
}
