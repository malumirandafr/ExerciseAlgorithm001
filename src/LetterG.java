import java.util.Scanner;

public class LetterG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstValue, secondValue, thirdValue, fourthValue;
        String result = "";

        System.out.print("Inform 1st value: ");
        firstValue = in.nextInt();
        System.out.print("Inform 2st value: ");
        secondValue = in.nextInt();
        System.out.print("Inform 3st value: ");
        thirdValue = in.nextInt();
        System.out.print("Inform 4st value: ");
        fourthValue = in.nextInt();

        if (firstValue % 2 == 0 && firstValue % 3 == 0){
            result =  firstValue + " is divisible simultaneously by 2 and 3. \n";
        }

        if (secondValue % 2 == 0 && secondValue % 3 == 0){
            result = result  + secondValue + " is divisible simultaneously by 2 and 3. \n";
        }

        if (thirdValue % 2 == 0 && thirdValue % 3 == 0){
            result = result + thirdValue + " is divisible simultaneously by 2 and 3. \n";
        }

        if (fourthValue % 2 == 0 && fourthValue % 3 == 0){
            result = result + fourthValue + " is divisible simultaneously by 2 and 3. \n";
        }

        if(!(firstValue % 2 == 0 && firstValue % 3 == 0) &&
                !(secondValue % 2 == 0 && secondValue % 3 == 0) &&
                !(thirdValue % 2 == 0 && thirdValue % 3 == 0) &&
                !(fourthValue % 2 == 0 && fourthValue % 3 == 0)){
            System.out.println("None of the numbers are divisible simultaneously by 2 and 3."); return;
        }

        System.out.println(result);
    }
}
