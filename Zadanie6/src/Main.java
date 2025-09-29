import java.util.Random;
import java.util.Scanner;

/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B
вводятся с клавиатуры. Выведите массив на экран, после чего инвертируйте его и
выведите уже инвертрованный массив */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Введите размер массива: ");
        int size= sc.nextInt();
        int [] arr =  new int [size];
        System.out.print("Введите нижний диапазон массива: ");
        int min= sc.nextInt();
        System.out.print("Введите верхний диапазон массива: ");
        int max = sc.nextInt();
        for (int i=0; i<arr.length; i++){
            arr[i]=rnd.nextInt(((max-min)+1)+min);
        }
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println(" ");
        for (int j=0; j<arr.length/2; j++){
            int temp = arr[j];
            arr[j]=arr[arr.length-j-1];
            arr[arr.length-j-1]=temp;
        }
        for (int a: arr){
            System.out.print(a+" ");
        }
    }
}