package homeWorks.hw5;
import java.util.Arrays;
public class HomeWork5 {
    public static void main(String[] args) {
        // Задание №5
        //Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
        //Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
        String str5 = "в предложении все слова разной длины , но самое длинное - sdlfjhsdlfwelifhwljhddss";
        String[] words1 = str5.split(" ");
        for (int a = words1.length; a >= 0; a--){
            for (int b = 1; b < words1.length; b++) {
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