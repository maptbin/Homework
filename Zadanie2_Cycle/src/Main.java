//Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
public class Main {
    public static void main(String[] args) {
        int x = 1;
        do {
            if (x%5==0){
                System.out.println(x);
            }
            x++;
        }    while (x <= 100);
    }
}