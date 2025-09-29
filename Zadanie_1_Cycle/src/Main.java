//Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while
public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x<10){
            x++;
            System.out.println("Task"+ " " +x);
        }
    }
}