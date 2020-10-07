package homeWorks.hw3;
import java.util.Arrays;
public class HomeWork1 {
    public static void main(String[] args) {
        // Задание №1
        // Заполните массив на N элементов случайным целыми числами
        // и выведете максимальное, минимальное и среднее значение
        int max = 100, min = -100;
        int[] mas1  = new int [10];
        int maxNumber = -101;
        int minNumber = 101;
        int sred = 0;
        for (int i = 0; i < mas1.length; i++) {
            int x = min + (int)(Math.random() * ((max - min) + 1));
            mas1[i] = x;
            if (maxNumber <= mas1[i]){
                maxNumber = mas1[i];}
            if (minNumber>mas1[i]){
                minNumber = mas1[i];
            }
            sred += mas1[i];
        }
        System.out.println(Arrays.toString(mas1));
        Arrays.sort(mas1);
        System.out.println(Arrays.toString(mas1));
        sred = sred/ mas1.length;
        System.out.println("Среднее арифметическое = " + sred);
        System.out.println("maxNumber = "+maxNumber);
        System.out.println("minNumber = "+minNumber);

    }
}
