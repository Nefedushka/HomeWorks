package homeWorks.hw5;
import java.util.Arrays;
public class HomeWork5 {
    public static void main(String[] args) {
        // Задание №5
        //Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
        //Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
        String str5 = "в предложении все слова разной длины , но самое длинное";
        String[] words1 = str5.split(" ");
        int size = words1.length;
        for (int a = size; a >= 0; a--){
            for (int b = 1; b < size; b++) {
                if (words1[b - 1].length() < words1[b].length()) {
                    String t = words1[b - 1];
                    words1[b - 1] = words1[b];
                    words1[b] = t;
                }
            }
        }
        System.out.println(Arrays.toString(words1));
        System.out.println("Самое длинное слово: " + words1[0]);
    }
}
