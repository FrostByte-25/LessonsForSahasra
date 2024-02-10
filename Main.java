import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do: (m for multipication, d for division, s for subtraction, a for addition, p for percent), e for exponent");
        String s = scan.nextLine();
        if(s.equals("p"))
        {
            percentCalc p = new percentCalc();
        }
        else {
            System.out.println("Put one number: ");
            double one1 = scan.nextDouble();

            System.out.println("Put another number: ");
            double two2 = scan.nextDouble();


            if (s.equals("s")) {
                System.out.print(one1 - two2);
            }
            else if (s.equals("m")) {
                System.out.print(one1 * two2);
            }
            else if (s.equals("d")) {
                System.out.print(one1 / two2 * 1.0);
            }
            else if (s.equals("a")) {
                System.out.print(one1 + two2);
            }
            else if (s.equals("e")) {
                System.out.print(Math.pow(one1, two2));
            }
            else {
                System.out.print("ERROR");
            }
        }
    }
}