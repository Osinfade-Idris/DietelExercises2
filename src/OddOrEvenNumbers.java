import java.util.Scanner;
public class OddOrEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.println("Enter Number: "); //prompt
        a=input.nextInt();

        if (a % 2 == 0){
            System.out.println("The number " + a + " is an even number");
        }else{
            System.out.println("The number " + a + " is a odd number");
        }
    }
}
