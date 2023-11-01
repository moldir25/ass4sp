public class Book implements INFO{
    private String title;
    private int quantity;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, int year, int quantity , String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void info() {
        System.out.println("TITLE: " + title);
        System.out.println("AUTHOR: " + author);
        System.out.println("QUANTITY: " + quantity);
        System.out.println("ISBN: " + isbn);
        System.out.println("YEAR: " + year);
    }

    public String saveInfo() {
        return "TITLE: " + title + " AUTHOR: " + author + " QUANTITY: " + quantity  + " YEAR: "
                + year +" ISBN: " + isbn +  "\n";
    }
}



