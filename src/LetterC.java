import java.util.Scanner;

public class LetterC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double firstValue, secondValue, thirdValue, fourthValue, average;

        System.out.print("Type the student 1st grade: ");
        firstValue = in.nextDouble();
        System.out.print("Type the student 2st grade: ");
        secondValue = in.nextDouble();
        System.out.print("Type the student 3st grade: ");
        thirdValue = in.nextDouble();
        System.out.print("Type the student 4st grade: ");
        fourthValue = in.nextDouble();

        average = (firstValue + secondValue + thirdValue + fourthValue) / 4;

        if (average >= 5)
            System.out.println("Approved with average: " + average);
        else
            System.out.println("Disapproved with average: " + average);

    }
}
