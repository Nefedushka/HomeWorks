package homeWorks.hw3;
import java.util.Arrays;
public class HomeWork2 {
    public static void main(String[] args) {
        //Задание №2
        //Создайте массив из чётных чисел [2;20]
        // и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
        int size=0;
        for (int j = 2; j <= 20; j += 2) {
            size++;
        }
        int[] mas2  = new int [size];
        for (int i = 0, x = 2; i < size; i++, x += 2) {
            mas2[i] = x;
        }
        System.out.println(Arrays.toString(mas2));
        for (int a = size; a >= 0; a--){
            for (int b = 1; b < size; b++){
                if (mas2[b-1] < mas2[b]){
                    int t = mas2[b-1];
                    mas2[b-1] = mas2[b];
                    mas2[b] = t;
                }
            }
        }
        System.out.println(Arrays.toString(mas2));

    }
}
