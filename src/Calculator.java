import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static double main() {
        var myScanner = new Scanner(System.in);
        String operationSign;
        do {
            System.out.println("Jaką operację chcesz wykonać [+] [-] [*] [/]: ");
            operationSign = myScanner.next();

        } while (!operationSign.equals("+") && !operationSign.equals("-") && !operationSign.equals("*") && !operationSign.equals("/"));

        System.out.println("Podaj pierwszą wartość: ");
        double input1 = 0;
        boolean bError = true;

        while (bError) {
            try {
                input1 = myScanner.nextDouble();
                bError = false;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzona wartość nie jest liczbą. Podaj pierwszą wartość: ");
                myScanner.next();
            }
        }

        System.out.println("Podaj drugą wartość: ");
        double input2 = 0;
        bError = true;
        while (bError) {
            try {
                input2 = myScanner.nextDouble();
                bError = false;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzona wartość nie jest liczbą. Podaj drugą wartość: ");
                myScanner.next();
            }
        }
        double result = operation.doOperation(input1, input2, operationSign);
        System.out.println("Wynik: " + result);
        return result;
    }
}
