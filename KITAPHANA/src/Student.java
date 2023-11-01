import java.util.ArrayList;

public class Student implements INFO{
    private int id;
    private String name;

    private ArrayList<Book> borrowedBooks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void add(Book book) {
        borrowedBooks.add(book);
    }

    public void delete(Book book) {
        borrowedBooks.remove(book);
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }


    public void info() {
        System.out.println("ID : " + id);
        System.out.println("Name: " + name);
        borrowedBooks.forEach(p -> System.out.println(p.getTitle() + " " + p.getAuthor() + " " + "\n"));
    }

    public String saveInfo() {
        String res = "ID : " + id + " Name: " + name + "\n";
        for (Book book : borrowedBooks) {
            res += book.saveInfo();
        }
        return res;
    }

}

