public class Book {
    private String nameBook; //Название книги
    private String authorName; //Имя автора
    private String text; //Содержание книги

    //конструктор
    public Book(String nameBook, String authorName) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.text = "";
    }

    //геттер для названия книги
    public String getNameBook() {
        return this.nameBook;
    }

    //геттер для автора
    public String getAuthorName() {
        return this.authorName;
    }

    //геттер для текста = null, т.к. пустое значение выше
    public String getText() {
        return this.text;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString(){
        return "'"+nameBook+"' ("+authorName+")";
    }
}
