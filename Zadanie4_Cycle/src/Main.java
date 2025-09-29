/*Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа,
расположенные между A и B (не включая числа A и B), а также количество N этих чисел. */
public class Main {
    public static void main(String[] args) {
    int a=5;
    int b=10;
    System.out.println(b-a-1);
    for (int c=b-1; c>a; c--){
        System.out.println(c);
    }
    }
}