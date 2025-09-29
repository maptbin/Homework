import java.util.Random;
import java.util.Scanner;

/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B
вводятся с клавиатуры. Определите какой элемент является в этом массиве
максимальным и сообщите его индекс */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd= new Random();
        System.out.print("Введите размер массива:");
        int size = sc.nextInt();
        System.out.print("Введите нижний диапазон значений массива:");
        int min = sc.nextInt();
        System.out.print("Введите верхний диапазон значений массива:");
        int max = sc.nextInt();
        int [] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            arr[i]= rnd.nextInt(((max-min)+1)+min);
        }for (int a : arr){
            System.out.print(a+" ");
        }int iMax=0;
        for (int i=0; i<arr.length; i++)
        if (arr[i]>arr[iMax]){
            iMax=i;
        }
        System.out.println("Индекс: "+ iMax+ " Значение: "+ arr[iMax]);
    }
}