package homeWorks.hw2;
import java.util.Scanner;
public class HomeWork5 {
    public static void main(String[] args) {
        // Задание №5
        // Задача на синтаксис switch. Дана целочисленная переменная (номер билета от пользователя):
        //если ее значение 111, 222 или 333 сообщить пользователю, что он получит "Книгу",
        //если ее значение 444 или 555 сообщить пользователю, что он получит "Телефон",
        //если ее значение 777 сообщить пользователю, что он получит "Ноутбук".
        //В остальных случаях сообщить, что приза нет.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер билета");
        int num = scanner.nextInt();
        switch (num) {
            case 111:
            case 222:
            case 333:
                System.out.println("Ваш приз Книга");
                break;
            case 444:
            case 555:
                System.out.println("Ваш приз Телефон");
                break;
            case 777:
                System.out.println("Ваш приз Ноутбук");
                break;
            default:
                System.out.println("К сожаление, Вы не выиграли приз");

        }
    }
}
