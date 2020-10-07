package homeWorks.hw3;
import java.util.Arrays;
public class HomeWork3 {
    public static void main(String[] args) {
        // Задание №3
        // Создайте массив из 11 случайных целых чисел из отрезка [-1;1],выведите массив в консоль.
        // Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
        // Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        int max3 = 1, min3 = -1, a = 0, b = 0, c = 0;
        int[] mas3  = new int [11];
        for (int i = 0; i < mas3.length; i++) {
            int x = min3 + (int) (Math.random() * ((max3 - min3) + 1));
            mas3[i] = x;
        }
        for (int i = 0; i < mas3.length;i++){
            switch (mas3[i]){
                case -1:
                    a += 1;
                    break;
                case 0:
                    b += 1;
                    break;
                case 1:
                    c += 1;
            }
        }

        System.out.println(Arrays.toString(mas3));
        System.out.println("-1= "+a+", "+"0= "+b+", "+"1= "+c);
        if (a >b && a>c){
            System.out.println("Чаще всего встречается -1, "+a+" раз");
        }
        else if (b>a && b>c){
            System.out.println("Чаще всего встречается 0, "+b+" раз");
        }
        else if (c>a && c>b){
            System.out.println("Чаще всего встречается 1, "+c+" раз");
        }
    }
}
