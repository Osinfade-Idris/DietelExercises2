import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter First Number: "); //prompt
        number1=input.nextInt();

        System.out.println("Enter Second Number: "); //prompt2
        number2=input.nextInt();

        if (number2 % number1 == 0){
            System.out.println("The integer "+ number1  +" is a multiple of " + number2);
        }
    }
}
