import java.util.Scanner;

public class LetterD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double first, second, third, fourth, average, finalExam, finalAverage;

        System.out.print("Inform the 1st grade: ");
        first = in.nextDouble();
        System.out.print("Inform the 2st grade: ");
        second = in.nextDouble();
        System.out.print("Inform the 3st grade: ");
        third = in.nextDouble();
        System.out.print("Inform the 4st grade: ");
        fourth = in.nextDouble();

        average = (first + second + third + fourth) / 4;

        if ( average >=7)
            System.out.println("Approved with average: " + average);
        else
        {
            System.out.println("Disapproved with average: " + average);
            System.out.print("Inform the Final Exam grade: ");
            finalExam = in.nextDouble();

            finalAverage = ( finalExam + average ) / 2;

            if ( finalAverage >=5)
                System.out.println("Approved in Final Exam with average: " + finalAverage);
            else
                System.out.println("Disapproved in Final Exam with average: " + finalAverage);
        }


    }
}