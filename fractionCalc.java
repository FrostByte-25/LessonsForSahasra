
import java.util.Scanner;

public class fractionCalc {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do: (m for multipication, d for division, s for subtraction, a for addition)");
        String s = scan.nextLine();

        System.out.println("Put the numerator: ");
        int n1 = scan.nextInt();

        System.out.println("Put the denominator: ");
        int d1 = scan.nextInt();

        System.out.println("Put another numerator: ");
        int n2 = scan.nextInt();

        System.out.println("Put another denominator: ");
        int d2 = scan.nextInt();

        fraction f1 = new fraction(n1, d1);
        fraction f2 = new fraction(n2, d2);



    }
}
