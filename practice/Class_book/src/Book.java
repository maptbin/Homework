public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    public Book(String title, String author){
        this.title=title;
        this.author=author;
        this.pages=100;
    }
    public void displayInfo(){
        System.out.println("Название: "+this.title+"; Автор: "+this.author+"; Кол-во стр.: "+this.pages);
    }


}
