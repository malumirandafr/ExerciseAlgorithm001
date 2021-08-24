import java.util.Scanner;

public class LetterA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstValue, secondValue;

        System.out.print("Informe um valor: ");
        firstValue = in.nextInt();

        System.out.print("Informe outro valor: ");
        secondValue = in.nextInt();

        if ( firstValue > secondValue)
            System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        else
            System.out.println(secondValue + " - " + firstValue + " = " + (secondValue - firstValue));
    }
}
