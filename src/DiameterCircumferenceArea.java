import java.util.Scanner;
public class DiameterCircumferenceArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double Area,Diameter, Circumference;

        System.out.println("Enter The Radius of the Circle: "); //prompt
        r=input.nextInt();

        Area = 3.14159 * r * r;

        Diameter = 2 * r;

        Circumference = 2 * 3.14159 * r;


        System.out.printf("The Diameter of the Circle is %f%n", Diameter);

        System.out.printf("The Circumference of the Circle is %f%n", Circumference);

        System.out.printf("The Area of the Circle is %f%n", Area);


    }
}
