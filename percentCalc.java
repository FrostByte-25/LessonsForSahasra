import java.util.Scanner;
public class percentCalc {
    public percentCalc()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("put a number: ");
        int num = scan.nextInt();

        System.out.println("put a percent:");
        int percent = scan.nextInt();

        double p = percent/100.0;
        System.out.println(num*p);
    }
}
