package homeWorks.hw2;
import java.util.Scanner;
public class HomeWork1 {
        public static void main(String[] args){

//      Задание №1
            /*Пользователь! загадывает число в диапазоне от [1 до 100],
            программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
            Программа может задавать пользователю вопросы:
            Число равно X? / Число больше X? / Число меньше X?
            и в зависимоти от ответа пользователя принимать решения.
            PS: вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

*/
            Scanner scanner = new Scanner(System.in);
            int min = 0, max = 101, mid;
            System.out.println("Загадайте число от: " + (min + 1) + " до " + (max - 1));
            System.out.println("Введите 0 - НЕТ и 1 - ДА");
            while (min <= max) {
                mid = (min + max) / 2;
                System.out.println("Введенное число: " + mid + "?");
                int num = scanner.nextInt();
                if (num == 1) {
                    System.out.println("Ура! Ваше число: " + mid + "?");
                    return;
                }
                if (num == 0) {
                    int x = (int) (Math.random() * 2);
                    System.out.println("X= " + x);
                    if (x == 0) {
                        System.out.println("Ваше число больше: " + mid + "?");
                        int num1 = scanner.nextInt();
                        if (num1 == 1) min = mid + 1;
                        else if (num1 == 0) max = mid - 1;
                    }
                    if (x == 1) {
                        System.out.println("Ваше число меньше: " + mid + "?");
                        int num2 = scanner.nextInt();
                        if (num2 == 1) max = mid - 1;
                        else if (num2 == 0) min = mid + 1;
                    }
                }
            }
        }
    }
