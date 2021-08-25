import java.util.Scanner;

public class LetterD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double firstValue, secondValue, thirdValue, fourthValue, average, finalExam, finalAverage;

        System.out.print("Inform the 1st grade: ");
        firstValue = in.nextDouble();
        System.out.print("Inform the 2st grade: ");
        secondValue = in.nextDouble();
        System.out.print("Inform the 3st grade: ");
        thirdValue = in.nextDouble();
        System.out.print("Inform the 4st grade: ");
        fourthValue = in.nextDouble();

        average = (firstValue + secondValue + thirdValue + fourthValue) / 4;

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