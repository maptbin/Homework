public class Main {
    public static void main(String[] args) {
        int calc = 4;

        double a = 10;
        double b = 5;
        if (calc == 1){
            System.out.println(a+b);
        } else if (calc == 2) {
            System.out.println(a-b);
        } else if (calc == 3) {
            System.out.println(a * b);
        } else if (calc == 4 && b==0) {
            System.out.printf("You can't divide by zero.");
        } else if (calc == 4 && b!=0) {
        //Я не знаю, обязательно ли уточнять программе, что б не равно нулю, без этого уточнения тоже все работает
            System.out.println(a/b);
        }else {
        }
    }
}