import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String fullName; //Имя, Фамилия и Отчество читателя
    private String faculty; //Название факультета
    private String dateBirth; //Дата рождения (день, месяц, год)
    private String phoneNumber; //Номер телефона
    private int ticketNumber; //Номер читательского билета
    private List<Book> borrowedBooks; //Список из взятых книг
    private static final int MAX_BOOKS = 10;// Убрал переменную для сравнения количества книг
    // и добавил константу для лимита книг

    //Конструктор
    public Reader(String fullName, String faculty, String dateBirth, String phoneNumber, int ticketNumber) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.ticketNumber = ticketNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    //метод takeBook
    public void takeBook(Book book) {
        if (borrowedBooks.size() < MAX_BOOKS) {
            borrowedBooks.add(book);
            System.out.println(getFullName() + " взял\\а книгу " + book.getNameBook());
        } else {
            System.out.println("Нельзя взять книгу, т.к. превышен лимит (" + MAX_BOOKS + ") книг.");
        }
    }

    public void takeBook(String... bookNames) {
        for (String bookName : bookNames) {
            Book newBook = new Book(bookName, "Лабудибда");
            takeBook(newBook);
        }
    }

    //Метод returnBook
    public void returnBook(String bookName) {
        Book bookToRemove = null;
        for (Book book : borrowedBooks) {
            if (book.getNameBook().equals(bookName)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            borrowedBooks.remove(bookToRemove);
            System.out.println(fullName + " вернул книгу: " + bookName);
        } else {
            System.out.println(fullName+" не хранит книгу "+bookName);
        }
    }

    //Метод printStatus
    public void printStatus() {
        if (borrowedBooks.isEmpty()){
            System.out.println(fullName+ " не брал книг.");
            return;
        }
        String listBooks = borrowedBooks.toString();
        System.out.println(fullName+" взял "+borrowedBooks.size()+" книги: "+listBooks);
    }

    public void printStatus(boolean fullInf) {
        if (fullInf) {
            System.out.println("ФИО: " + fullName);
            System.out.println("Номер билета: " + ticketNumber);
            System.out.println("Факультет: " + faculty);
            System.out.println("Дата рождения: " + dateBirth);
            System.out.println("Номер телефона: " + phoneNumber);
            System.out.println("Текущий статус: ");
            printStatus();
        }
    }

}