/*Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено
максимально возможное количество квадратов со стороной C (без наложений).
Найти количество квадратов, размещенных на прямоугольнике. */
public class Main {
    public static void main(String[] args) {
        int a =10;
        int b =12;
        int c= 3;
        int s=a*b;
        int s2=c*c;
        do {
            System.out.println(s/s2);
        }while (s2>=s);
    }
}