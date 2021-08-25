import java.util.Scanner;

public class LetterB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value, result;

        System.out.print("Type value: ");
        value = in.nextInt();

        result = (value * -1);

        if ( value < 0)
            System.out.println(value + " * " + -1 + " = " + result) ;
        else
            System.out.println(value);
    }
}
