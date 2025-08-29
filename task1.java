import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вариант 1: Фиксированные значения
        int a = 1;
        int b = 2;
        System.out.println("=== Вариант 1 (Фиксированные значения)===");
        compareAndCalculate(a, b);

        // Вариант 2: Ввод с клавиатуры
        System.out.println("\n=== Вариант 2 (Ввод через консоль) ===");
        System.out.print("Введите число a: ");
        a = scanner.nextInt();

        System.out.print("Введите число b: ");
        b = scanner.nextInt();

        compareAndCalculate(a, b);

        scanner.close();
    }

    // Общий метод для сравнения и вычислений
    private static void compareAndCalculate(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        if (b != 0) {
            System.out.println("a / b = " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно!");
        }
    }
}
