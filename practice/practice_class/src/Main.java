import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person pers = new Person();
        System.out.println("Введите имя:");
        pers.name = sc.nextLine();
        System.out.println("Введите фамилию:");
        pers.surname = sc.nextLine();
        System.out.println("Введите профессию:");
        pers.profession = sc.nextLine();
        System.out.println("Введите возраст:");
        pers.age = sc.nextInt();
        System.out.println(pers.name+" "+pers.surname+" "+pers.profession+" "+pers.age+" лет");
    }
}
