import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярное выражение,
 которое найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
 */
public class Main {
    public static void main(String[] args) {
        String input="ahb acb aeb aeeb adcb axeb";
        Pattern pattern=Pattern.compile("a\\wb");
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}