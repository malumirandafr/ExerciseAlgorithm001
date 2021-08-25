import java.util.Scanner;

public class LetterH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c,d,e, higher, smallest;

        System.out.print("Inform 1st value: ");
        a = in.nextInt();
        System.out.print("Inform 2st value: ");
        b = in.nextInt();
        System.out.print("Inform 3st value: ");
        c = in.nextInt();
        System.out.print("Inform 4st value: ");
        d = in.nextInt();
        System.out.print("Inform 5st value: ");
        e = in.nextInt();

        if(a > b)
            higher = a;
        else if (b > c)
            higher = b;
        else if (c > d)
            higher = c;
        else if (d > e)
            higher = d;
        else
            higher = e;
        System.out.println("The higher number is " + higher);

        if(a < b)
            smallest = a;
        else if (b < c)
            smallest = b;
        else if (c < d)
            smallest = c;
        else if (d < e)
            smallest = d;
        else
            smallest = e;
        System.out.println("The smallest number is " + smallest);

    }
}
