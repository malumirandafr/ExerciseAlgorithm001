import java.util.Scanner;

public class LetterK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value;

        System.out.print("Enter a number: ");
        value = in.nextInt();

        if (value < 3)
            System.out.println(value);
    }
}
