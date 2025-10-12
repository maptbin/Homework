import java.util.Scanner;

/*С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с
просьбой повторить ввод. Далее с клавиатуры вводятся два символа (a и b), после
чего нужно вывести строку, в которой все символы a нужно заменить на символы b.
Пример: строка – «Java 11», символы «1» и «H», результат «Java HH» */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();
        if (text.length()==0){
            System.out.println("Повторите ввод!");
            return;
        }
        System.out.print("Введите символ A: ");
        String sym1 = sc.nextLine();
        if (sym1.length()!=1){
            System.out.println("Введите один символ");
            return;
        }
        System.out.print("Введите символ B: ");
        String sym2=sc.nextLine();
        if (sym2.length()!=1) {
            System.out.println("Введите один символ");
            return;
        }
        char symbol1 = sym1.charAt(0);
        char symbol2 = sym2.charAt(0);
        String text2= text.replace(symbol1,symbol2);
        System.out.println("Результат: "+text2);
    }
}