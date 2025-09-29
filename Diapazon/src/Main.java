public class Main {
    public static void main(String[] args) {
        int x = 4;
        if (x == 0) {
            System.out.printf("Ноль");
        } else if (x <= 9 && x % 2 == 0) {
            System.out.printf("Четное однозначное число");
        } else if (x<=9 && x%2!=0) {
            System.out.printf("Нечетное однозначное число");
        } else if (x>=10 && x<=99 && x%2==0) {
            System.out.printf("Четное двузначное число");
        } else if (x>=10 && x<=99 && x%2!=0) {
            System.out.printf("Нечетное двузначное число");
        } else if (x>=100 && x<=999 && x%2==0) {
            System.out.printf("Четное трехзначное число");
        } else if (x>=100 && x<=999 && x%2!=0) {
            System.out.printf("Нечетное трехзначное число");
        } else {

        }
    }
}