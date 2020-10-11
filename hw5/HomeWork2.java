package homeWorks.hw5;
//Задаиние №2
//Найти количество вхождений одной строки в другую.
//Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Впишите строку:");
        String str21 = s2.nextLine();
        System.out.println("Впишите искомую подстроку");
        String str22 = s2.nextLine();
        int result = 0;
        String[] words = str21.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(str22)) result++;
        }
        System.out.println("В строке: " + "\n"+"\"" + str21+ "\"" +
                "\n"+ "Искомая подтрока: " + "\n"+"\"" + str22+ "\"" +
                "\n" + "Содержится: " + result + "раз");
    }
}
