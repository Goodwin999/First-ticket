public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        task1();
    }

    public static void expandArray() {
        int[] numbers = {1, 2, 3};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        expandArray();

    }
}