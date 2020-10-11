package homeWorks.hw5;
import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        //Задание №3
        //Написать функцию, которая проверяет, является ли строка палиндромом.
        //Палиндром — это число, буквосочетание, слово или текст,
        //которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
        //Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
        Scanner s3 = new Scanner(System.in);
        System.out.println("Впишите строку, для проверки на палиндром :");
        String str3 = s3.nextLine();
        StringBuilder pol1 = new StringBuilder(str3.replaceAll("\\s++","").toLowerCase());
        String pol2 = new String(pol1);
        if (pol2.contentEquals(pol1.reverse()))
            System.out.println("Строка: " + "\""+str3+"\"" + " - палиндром");
        else System.out.println("Строка: " + "\""+str3+"\"" + " - не палиндром");
    }
}
