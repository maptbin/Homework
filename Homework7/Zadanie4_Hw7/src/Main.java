import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Дана строка 'ab abab abab abababab abea'. Напишите регулярное выражение,
которое найдет строки по шаблону: строка 'ab' повторяется 1 или более раз.
 */
public class Main {
    public static void main(String[] args) {
        String input = "ab abab abab abababab abea";
        Pattern pattern=Pattern.compile("(ab)+");
        Matcher matcher=pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}