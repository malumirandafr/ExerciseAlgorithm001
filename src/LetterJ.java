import java.util.Scanner;

public class LetterJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value;

        System.out.print("Enter a number from 1 to 9: ");
        value = in.nextInt();

        if (value >= 1 && value <= 9)
            System.out.println("The value is in the allowable range.");
        else
            System.out.println("The value isn't in the allowable range.");
    }
}
