import java.util.Scanner;

/*Написать программу, в которой вводятся с клавиатуры сперва строка, а потом
символ. После чего в консоль выводится количество вхождений символа в строку.
Например, строка «Java 11», символ «a», результат: 2 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        System.out.println("Введите символ");
        String let = sc.nextLine();
        if (let.length()!=1){
            System.out.println("Введите один символ!");
            return;
        }
        char sym = let.charAt(0);
        int a = 0;
        for (int k=0; k<text.length(); k++){
            if (text.charAt(k) == sym){
                a++;
            }
        }
        System.out.println("Количество символов "+a);
    }
}