import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        var myScanner = new Scanner(System.in);


        String operationSign;
        do {
//            Runtime.getRuntime().exec("clear");
            System.out.println("Jaką operację chcesz wykonać [+] [-] [*] [/]: ");
            operationSign = myScanner.next();

        } while (!operationSign.equals("+") && !operationSign.equals("-") && !operationSign.equals("*") && !operationSign.equals("/"));

        System.out.println("Podaj pierwszą wartość: ");
        var input1 = myScanner.nextDouble();

        System.out.println("Podaj drugą wartość: ");
        var input2 = myScanner.nextDouble();

        double result = operation.doOperation(input1, input2, operationSign);
        System.out.println("Wynik: " + result);
    }
}
