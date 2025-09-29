//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numberYear = 1300;
        if ((numberYear % 4) == 0 && (numberYear % 100) != 0 || (numberYear % 400) == 0) {
            System.out.printf("Leap year");
        } else {
            System.out.printf("It isn't leap year");
        }
    }
}
