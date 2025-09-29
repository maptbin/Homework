public class Main {
    public static void main(String[] args) {
        int monday = 1;
        if (monday == 1) {
            System.out.printf("Monday");
        } else if (monday > 1 && monday == 2) {
            System.out.printf("Tuesday");
        } else if (monday > 2 && monday == 3) {
            System.out.printf("Wednesday");
        } else if (monday>3&&monday==4) {
            System.out.printf("Thursday");
        } else if (monday>4&&monday==5) {
            System.out.printf("Friday");
        } else if (monday>5&&monday==6) {
            System.out.printf("Saturday");
        } else if (monday>6&&monday==7) {
            System.out.printf("Sunday");
        } else {
            System.out.printf("There is no such day");
    }
    }
}