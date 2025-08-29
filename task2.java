import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вариант 1: Жёстко заданные строки
        String a = "Добрый день";
        String b = "Добрый день";
        System.out.println("=== Вариант 1 (жёстко заданные строки) ===");
        compareStrings(a, b);

        // Вариант 2: Ввод строк с клавиатуры
        System.out.println("\n=== Вариант 2 (ввод через консоль) ===");
        System.out.print("Введите строку a: ");
        a = scanner.nextLine();

        System.out.print("Введите строку b: ");
        b = scanner.nextLine();

        compareStrings(a, b);

        scanner.close();
    }

    // Метод для сравнения строк
    private static void compareStrings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
