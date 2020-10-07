package homeWorks.hw5;
import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
        // Задание №4
        //Заменить все буквы в слове на строчные, а первую букву на заглавную
        //Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
        Scanner s4 = new Scanner(System.in);
        System.out.println("Впишите строку :");
        String str4 = s4.nextLine();
        String result = "";
        if(str4 != null) {
            // str.substring() возвращает новую строку, которая является подстрокой данной строки.
            // Подстрока начинается с символа, заданного индексом,
            // и продолжается до конечного индекс, не включая его.
            result += str4.substring(0, 1).toUpperCase();
            //toUpperCase() возвращает строку, преобразованную в верхний регистр

            for(int i = 1, n = str4.length(); i < n; i++) {
                //charAt() возвращает символ из массива строки по указанному индексу.
                // таким образом ищется первый символ после пробела
                if(str4.charAt(i - 1) == ' ' && str4.charAt(i) != ' ')  {
                    result += str4.substring(i, i + 1).toUpperCase();
                } else {
                    result += str4.substring(i, i + 1).toLowerCase();
                    // toLowerCase() возвращает строку, преобразованную в нижний регистр.
                }
            }
        }
        System.out.println("Новая строка: \n" + result);
    }
}
