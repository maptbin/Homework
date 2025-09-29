import java.util.Random;
import java.util.Scanner;

/*Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B
вводятся с клавиатуры. Отсортировать массив любым алгоритмом. Вывести массив
на экран, после чего ввести с клавиатуры число k, найти индекс этого числа в
массиве сперва линейным поиском, потом двоичным и вывести на экран этот
индекс, если число есть в массиве, и количество «шагов», которое каждый алгоритм
потратил на выполнение задачи. Например:
Введите размер массива
9
Введите нижний диапазон
0
Введите верхний диапазон
10
Массив: 1, 2, 2, 3, 5, 6, 7, 8, 8
Введите искомое значение
3
Индекс элемента: 3
Линейный поиск: 4 шаг(-а)(-ов)
Двоичный поиск: 3 шаг(-а)(-ов) */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        System.out.print("Введите мин значение: ");
        int min = sc.nextInt();
        System.out.print("Введите мах значение: ");
        int max= sc.nextInt();
        int[] array =new int[size];
        for (int i = 0; i< size; i++){
            array[i]= rnd.nextInt(max-min+1)+min;
        }
        for (int a: array){
            System.out.print(a+" ");
        }


        for (int a= array.length-1; a>=0; a--){
            int iMax = a;
            for (int k =a; k>=0; k--){
                if (array[k]>array[iMax]){
                    iMax=k;
                }
            }
            if (iMax!=a){
                int temp=array[iMax];
                array[iMax]=array[a];
                array[a]=temp;
            }
        }System.out.println(" ");
        for (int a: array){
            System.out.print(a+" ");
       /* for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length-i-1; j++){
                if (array[j]> array[j+1]){
                    int t = array[j];
                    array[j]= array[j+1];
                    array[j+1]=t;
                }
            }
        }*/

        }
    }
}