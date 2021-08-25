import java.util.Scanner;

public class LetterF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c, aux;

        System.out.print("Inform 1st value: ");
        a = in.nextInt();
        System.out.print("Inform 2st value: ");
        b = in.nextInt();
        System.out.print("Inform 3st value: ");
        c = in.nextInt();

        if ( a > b)
        {
            aux = a;
            a = b;
            b = aux;
        }
        if ( a > c)
        {
            aux = a;
            a = c;
            c = aux;
        }
        if ( b > c)
        {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("Numbers typed and ordered: " + a + " / " + b + " / " + c);





    }
}

