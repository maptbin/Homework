//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 10;
        if (a >= c && b >= c) {
            System.out.println(a + b);
        } else if (b >= c && c >= a) {
            System.out.println(b + c);
        } else if (c >= b && a >= b) {
            System.out.println(c + a);
        } else {
        }
    }
}
// Я попробовал присвоить ноль переменной 'а' и программа не сработала. Почему так?