import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter The First Number");
        number1 = input.nextInt();
        System.out.println("Enter The Second Number");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " Is Larger");
        }

        if  (number2 > number1){
            System.out.println(number2 + " Is Larger");
        }

        if  (number2 == number1){
            System.out.println("The Numbers are equal");
        }
    }
}
