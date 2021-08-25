import java.util.Scanner;

public class LetterI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Value;

        System.out.print("Inform 1st value: ");
        Value = in.nextInt();

        if (Value % 2 == 0)
            System.out.println("The value is an even number.");
        else
            System.out.println("The value is an odd number.");
    }
}
