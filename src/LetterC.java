import java.util.Scanner;

public class LetterC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double first, second, third, fourth, average;

        System.out.print("Type the student 1st grade: ");
        first = in.nextDouble();
        System.out.print("Type the student 2st grade: ");
        second = in.nextDouble();
        System.out.print("Type the student 3st grade: ");
        third = in.nextDouble();
        System.out.print("Type the student 4st grade: ");
        fourth = in.nextDouble();

        average = (first + second + third + fourth) / 4;

        if ( average >=5)
            System.out.println("Approved with average: " + average);
        else
            System.out.println("Disapproved with average: " + average);

    }
}
