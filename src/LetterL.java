import java.util.Scanner;

public class LetterL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sex, name;

        System.out.println("Type your name: ");
        name = in.nextLine();

        System.out.println("Type 'M' to Male or 'F' to female: ");
        sex= in.nextLine();

        if(sex.equals("M") || sex.equals("m"))
            System.out.println("Nice to meet you, Ildo Sr." + name);
        else if (sex.equals("F") || sex.equals("f"))
            System.out.println("Nice to meet you, Ilda Sra." + name);
        else {
            System.out.println("Invalid!");
        }

    }
}
