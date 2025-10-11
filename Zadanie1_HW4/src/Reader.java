public class Reader {
    private String fullName; //Имя, Фамилия и Отчество читателя
    private String faculty; //Название факультета
    private String dateBirth; //Дата рождения (день, месяц, год)
    private String phoneNumber; //Номер телефона
    private int ticketNumber; //Номер читательского билета
    private Book[] arrayBooks = new Book[10];//Массив из взятых книг
    private int sumBook = 0; //Переменная добавленная для сравнения количества книг с массивом

    //Конструктор
    Reader(String fullName, String faculty, String dateBirth, String phoneNumber, int ticketNumber) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.ticketNumber = ticketNumber;
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
        if (sumBook < arrayBooks.length) {
            for (int k = 0; k < arrayBooks.length; k++) {
                if (arrayBooks[k] == null) {
                    arrayBooks[k] = book;
                    sumBook++;
                    System.out.println(getFullName() + " взял\\а книгу " + book.getNameBook());
                    return;
                }
            }

        } else {
            System.out.println("Не может взять книгу, т.к. превышен лимит");
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
        int indexBook = -1;
        for (int k = 0; k < sumBook; k++) {
            if (arrayBooks[k] != null && arrayBooks[k].getNameBook().equals(bookName)) {
                indexBook = k;
                break;
            }
        }
        if (indexBook != -1) {
            arrayBooks[indexBook] = null;
            sumBook--;
            System.out.println(fullName + " вернул книгу " + bookName);
        } else {
            System.out.println(fullName + " не хранит книгу " + bookName);
        }

    }

    //Метод printStatus перегруженный
    public void printStatus() {
        if (sumBook == 0) {
            System.out.println(fullName + " не брал книг");
            return;
        }
        String bookList = "";
        for (int k = 0; k < sumBook; k++) {
            if (arrayBooks[k] != null) {
                bookList += arrayBooks[k].getNameBook();
                if (k < sumBook - 1) {
                    bookList += ", ";
                }
            }
        }
        System.out.println(fullName + " взял " + sumBook + " книги: " + bookList);
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