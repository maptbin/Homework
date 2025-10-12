import java.util.Scanner;

/*Создать и проинициализировать массив из 20 элементов. Ввести с клавиатуры
число n и найти, есть ли оно в массиве, и, если есть, вывести его индекс на экран.
Использовать линейный поиск */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Введите число для поиска: ");
        int num=sc.nextInt();
        int ind = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==num){
                ind=i;
            }
        }
        System.out.println("Индекс искомого элемента: "+ind);

    }
}