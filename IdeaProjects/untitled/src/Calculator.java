import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        double numberOne = userInput.nextDouble();
        System.out.println("Informe o segundo numero:");
        double numberTwo = userInput.nextDouble();

        double result = numberOne + numberTwo;

        System.out.println("O resultado da soma é:" + result);


        //double a = 20.5;

        //int numero1 = 85;
        //int numero2 = 80;
        //int Resultado = numero1 + numero2;
        //System.out.println(Resultado); //então para numero não precisa de aspas

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Informe seu nome:");
        //String name  = scanner.next();
        //System.out.println("Olá, " + name);




    }
}
