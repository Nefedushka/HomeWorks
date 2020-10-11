package homeWorks.hw5;

import java.util.Arrays;
import java.util.Scanner;
//Задание №1
//Заполнить массив
//Задать массив на N слов.
//В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
//В итоге в массиве будут только уникальные слова.
//Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
//Перед завершением программы, вывести получившийся массив в консоль
public class HomeWork1 {
    public static void main(String[] args) {
        String n = "";
        while (true) {
            System.out.println("Введите количесвто(только числа) слов в массиве из слов");
            Scanner s = new Scanner(System.in);
            n = s.nextLine();
            if (n.matches("\\d+")) break;
        }
        int n1 = Integer.parseInt(n);
        System.out.println("Массив состоит из: "+n1+" слов");
        String[] mas1 = new String[n1];
        for (int i = 0; i < mas1.length;) {
                Scanner s = new Scanner(System.in);
                System.out.println("Введите уникальное слово или exit для выхода из программы");
                n = s.nextLine().replaceAll("\\s++", "");
                if (n.toLowerCase().contentEquals("exit")) break;
                if (!Arrays.asList(mas1).contains(n)) {
                    mas1[i] = n;
                    i++;
                }
                else System.out.println("Слово: " + n + " уже было ранее введено");
        }
        //!mas1[i].equalsIgnoreCase(mas1[i - 1])
        System.out.println(Arrays.toString(mas1));
    }
}


