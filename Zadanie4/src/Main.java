import java.util.Random;
import java.util.Scanner;

/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B
вводятся с клавиатуры. Выведите массив на экран, после чего отсортируйте его с
помощью сортировки «пузырьком» и выведите уже отсортированный массив */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Введите минимальное значение диапазона массива: ");
        int min = sc.nextInt();
        System.out.print("Введите максимальное значение диапазона массива: ");
        int max = sc.nextInt();
        for (int a = 0; a < arr.length; a++) {
            arr[a] = rnd.nextInt(((max - min) + 1) + min);
        }
        System.out.println("Ваш массив: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("Массив отсортированный \"Пузырьком\": ");
        for (int i = 0; i < arr.length-1; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }

            }
        }
        for (int a:arr){
            System.out.print(a +" ");
        }
    }
}