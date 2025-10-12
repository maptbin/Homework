import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Выбрать существующие даты между 1000 и 2012 годом. Секунды могут быть опущены.
 В каждом месяце 30 дней. То есть дата в определённом формате вводится с клавиатуры,
 после чего, с помощью регулярного выражения, определяется, существует такая дата, или нет.
Пример:
2012/09/18 12:10 – существует
2012/24/18 12:10 – не существует
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате ГГГГ/ММ/ДД ЧЧ:ММ (года с 1000 по 2012):");
        String regex = "^(1[0-9]{3}|20[0-1][0-2])\\/(0[1-9]|1[0-2])\\/(0[1-9]|[1-2][0-9]|30)\\s" +
                "([0-1][0-9]|2[0-3]):([0-5][0-9])$";

        String inputDate = sc.nextLine();
        Matcher matcher = Pattern.compile(regex).matcher(inputDate);
        matcher.matches();
        if (!matcher.matches()) {
            System.out.println("Неверный формат даты. Даты\\времени: "+inputDate+" не существует");
        } else {
            System.out.println("Дата: " + inputDate + " существует");
        }

    }
}