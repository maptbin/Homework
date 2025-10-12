import java.util.Random;

/*Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на
экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndnum1 = rnd.nextInt(89) + 10;
        int[] arr = new int[4];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = rnd.nextInt(89) + 10;
            System.out.print(arr[a] + " ");
        }
        for (int a = 0; a < arr.length; a++) {
            if (a < arr.length - 1) {
                if (arr[a] >= arr[a + 1]) {
                    System.out.println("Не возрастающая последовательность");
                    break;
                }
            }
            if (a == arr.length) {
                System.out.println("Возрастающая последовательность");
            }
        }
    }
}