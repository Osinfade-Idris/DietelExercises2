import java.util.Scanner;
public class SeparatingDigits {
    public static void main(String[] args) {
        //object of the Scanner clas
        Scanner input = new Scanner(System.in);
        int number,digit1, digit2 ,digit3 ,digit4 ,digit5;

        System.out.println("Enter a five-digit number: ");
        number = input.nextInt();

    //reading a number from the user

        digit1=number/10000%10;
        digit2=number/1000%10;
        digit3=number/100%10;
        digit4=number/10%10;
        digit5=number%10;
//prints the digits
        System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);
    }
}
