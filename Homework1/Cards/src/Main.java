public class Main {
    public static void main(String[] args) {
        int m = 4;
        int n = 10;
        /*if (m == 1 && n >= 6 && n <= 10) {
            System.out.printf(n + " " + "пики");
        } else if (m == 2 && n>=6 && n<=10) {
            System.out.printf(n + " " +"Трефы");
        } else if (m == 3 && n >= 6 && n <= 10) {
            System.out.printf(n + " " +"Бубны");
        } else if (m == 4 && n >= 6 && n <= 10) {
            System.out.printf(n + " " +"Червы");
        } else {
            }
            Оставил этот код как неудачную попытку
            */
        switch (n){
            case 6:
                System.out.printf("Шестерка ");
                break;
            case 7:
                System.out.printf("Семёрка ");
                break;
            case 8:
                System.out.printf("Восьмёрка ");
                break;
            case 9:
                System.out.printf("Девятка ");
                break;
            case 10:
                System.out.printf("Десятка ");
                break;
            case 11:
                System.out.printf("Валет ");
                break;
            case 12:
                System.out.printf("Дама ");
                break;
            case 13:
                System.out.printf("Король ");
                break;
            case 14:
                System.out.printf("Туз ");
                break;
            default:
        }
        switch (m){
            case 1:
                System.out.printf("пики");
                break;
            case 2:
                System.out.printf("трефы");
                break;
            case 3:
                System.out.printf("бубны");
                break;
            case 4:
                System.out.printf("червы");
                break;
            default:
        }
    }
}
/*Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны,
4 — червы. Достоинству карт, старших десятки, присвоены номера:
 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны два целых числа: N — достоинство
 (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). Вывести название соответствующей
 карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 */