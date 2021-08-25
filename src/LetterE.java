import java.util.Scanner;

public class LetterE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Inform value of a: ");
        a = in.nextDouble();

        if (a == 0)
            System.out.println("For a 2nd degree equation to exist, a must be >0. ");
        else
        {
            System.out.print("Inform value of b: ");
            b = in.nextDouble();
            System.out.print("Inform value of c: ");
            c = in.nextDouble();

            System.out.println(a + "x² + " + b + "x + " + c + " = 0");

            delta = Math.pow(b, 2) - 4 * a * c;

            System.out.println("Delta: " + delta);

            if (delta >= 0)
            {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x' = " + x1);
                System.out.println("x'' = " + x2);
            }
            else
                System.out.println("There are no real roots.");
        }

    }
}
