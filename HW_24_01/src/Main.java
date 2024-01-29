import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Давайте возведем число в квадрат. Введите ваше число: ");
        double number = scanner.nextDouble();
        double resultOfSqrt = sqrt(number);
        System.out.println("Квадрат вашего числа равен: " + sqrt(number));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Давайте выполним сложение. Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();
        double resultOfSum = sum(number1, number2);
        System.out.println("Результат операции равен: " + resultOfSum);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Давайте выполним вычитание. Введите первое число: ");
        double number3 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number4 = scanner.nextDouble();
        double resultOfSubstraction = substraction(number3, number4);
        System.out.println("Результат операции равен: " + resultOfSubstraction);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Давайте выполним деление. Введите первое число: ");
        double number5 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number6 = scanner.nextDouble();
        double resultOfDivision = division(number5, number6);
        System.out.println("Результат операции равен: " + resultOfDivision);

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Давайте выполним деление с остатком. Введите первое число: ");
        int number7 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number8 = scanner.nextInt();
        int resultOfDivision2 = division2(number7, number8);
        System.out.println("Результат операции равен: " + resultOfDivision2);

    }

    public static double sqrt(double number) {
        double sqrtResult = number * number;
        return sqrtResult;
    }

    public static double sum(double number1, double number2) {
        double sumResult = number1 + number2;
        return sumResult;
    }

    public static double substraction(double number3, double number4) {
        double substractionResult = number3 - number4;
        return substractionResult;
    }

    public static double division(double number5, double number6) {
        double divisionResult = number5 / number6;
        return divisionResult;
    }

    public static int division2(int number7, int number8) {
        int division2Result = number7 % number8;
        return division2Result;
    }
}
