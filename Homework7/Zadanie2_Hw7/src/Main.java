import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Регулярное выражение, описывающее ссылку
Создать программу, которая, используя регулярное выражение, умеет в тексте распознавать
ссылку, заканчивающуюся на .com. Текст можно вводить с клавиатуры*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ссылку: ");
        String key = sc.nextLine();

        Matcher matcher = Pattern.compile("\\.com$").matcher(key);
        System.out.println(matcher.find());
    }
}