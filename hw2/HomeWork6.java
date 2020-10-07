package homeWorks.hw2;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        //Задание №6
        //Программа загадывает число в диапазоне [1;9]
        //Пользователь вводит число с клавиатуры
        //Программа в зависимости от введенного числа выводит в консоль следующее:
        //"загаданное число больше"
        //"загаданное число меньше"
        //"Вы угадали" (программа завершает работу)
        //если введен 0, выводит "выход из программы" (программа завершает работу)
        int max = 9;
        int min = 1;
        int x= min + (int)(Math.random() * ((max - min) + 1));
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Программа загадала число от 1 до 9\nВведите загаданное число. 0 для завершения");
            num = scanner.nextInt();

            if (num != 0 && x > num) System.out.println("Загаданное число большее введеного: " + num +
                    " Загаданное число: " + x);
            else if (num != 0 && x < num) System.out.println("Загаданное число меньше введеного: " + num +
                    " Загаданное число: " + x);
            else if (num != 0 && num == x) {
                System.out.println("Вы угадали! Ваше число: " + num +
                        " Загаданное число: " + x);
                break;
            }
        } while (num != 0);
        System.out.println("Вы ввели 0, программа завершена");

    }
}
