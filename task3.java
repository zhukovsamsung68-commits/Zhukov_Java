public class Main {
    public static void main(String[] args) {
        // Задан массив
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Чётные числа:");

        // Перебираем массив и проверяем чётность
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
