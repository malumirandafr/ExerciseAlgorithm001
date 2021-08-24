import java.util.Scanner;

public class LetterA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstValue, secondValue;

        System.out.print("Type value: ");
        firstValue = in.nextInt();

        System.out.print("Type another value: ");
        secondValue = in.nextInt();

        if ( firstValue > secondValue)
            System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        else
            System.out.println(secondValue + " - " + firstValue + " = " + (secondValue - firstValue));
    }
}
