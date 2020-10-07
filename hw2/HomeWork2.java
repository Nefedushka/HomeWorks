package homeWorks.hw2;

public class HomeWork2 {
    public static void main(String[] args) {
        // Задание №2
        /*Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/
        for (int n = 2, i = 1; i < 21; i++, n *= 2) {
            System.out.print(n + " ");
        }
    }
}
