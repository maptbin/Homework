public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Хроники Сиалы", "Пехов А. Ю.");
        Book book2 = new Book("Вино из одуванчиков", "Джером Сэлинджер");
        Book book3 = new Book("Медвежий угол", "Фредерик Бакман");

        Reader goncharov = new Reader("Гончаров И. В.", "Исторический", "23.08.1999",
                "937-99-92", 12345);

        System.out.println("takeBook: ");
        goncharov.takeBook(book1);
        goncharov.takeBook(book2);
        goncharov.takeBook(book3);
        System.out.println();

        System.out.println("printStatus: ");
        goncharov.printStatus();
        System.out.println();

        System.out.println("returnBook: ");
        goncharov.returnBook("Вино из одуванчиков");
        System.out.println();

        System.out.println("takeBook с перегрузом");
        goncharov.takeBook("Игра Эндера", "Властелин колец");
        System.out.println();

        System.out.println("printStatus");
        goncharov.printStatus();
    }
}