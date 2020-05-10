
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException
    {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do{
            try{
                System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();

                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);

                System.out.printf("\nResult %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
            }
            catch (InputMismatchException inputMisMatch)
            {
                System.err.printf("\nException %s\n", inputMisMatch);
                scanner.nextLine();
                System.out.println("You must enter integers, please try again\n");
            }
            catch (ArithmeticException arithmeticException)
            {
                System.out.printf("\nException %s\n", arithmeticException);

                System.out.println("Division by zero is not allowed, please enter valid denominator");
            }


        }while (continueLoop);


    }

}
