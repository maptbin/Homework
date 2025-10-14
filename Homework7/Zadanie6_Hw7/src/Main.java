import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создайте новое исключение и назовите его IncorrectInfoException, добавьте в него поля для
возраста и ФИО. Напишите программу, которая просит пользователя ввести ФИО через пробел и
возраст. Если Возраст больше 100 или меньше 0, то «бросать» IncorrectInfoException,
записывать в него данные пользователя и сообщение о том, что возраст некорректен. Если ФИО
длиннее 200 символов, или использовались символы пунктуации (.,!?& и тд), то тоже бросать
исключение и записывать в него сообщение о некорректности данных и сами данные. В обработке
исключения выводить на экран трассированный стек
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        try {
            System.out.println("Введите ФИО: ");
            name = sc.nextLine();
            System.out.println("Введите возраст: ");
            age = sc.nextInt();
            //Проверка возраста
            if (age < 0 || age > 100) {
                throw new IncorrectInfoException(name, "Некоректный возраст", age);
            }
            //Проверка длины ФИО
            if (name.length() > 200) {
                throw new IncorrectInfoException(name, "Слишком длинное ФИО", age);
            }
            String punkRegex = ".*[.,!\\?&].*";
            Pattern pattern = Pattern.compile(punkRegex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                throw new IncorrectInfoException(name, "Недопустимые символы (.,!?& и тд)", age);
            }
            System.out.println("Все проверки пройдены");
        } catch (IncorrectInfoException ex) {
            System.out.println("Ошибка");
            ex.toString();
            System.out.println("Трассированный стек");
            ex.printStackTrace();
        }
    }
}