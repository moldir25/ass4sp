import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



public class Library implements LibraryService {
    Scanner in = new Scanner(System.in);
    private ExternalServiceAdapter externalServiceAdapter;
    public Library(ExternalServiceAdapter externalServiceAdapter) {
        this.externalServiceAdapter = externalServiceAdapter;
    }

    public void processBooks() {
        List<Book> books = externalServiceAdapter.fetchBooksFromExternalService();

    }

    public void processStudents() {
        Student student = externalServiceAdapter.fetchStudentInfoFromExternalService(123);
    }

    public void LibraryInfo() {
        System.out.println("Welcome to Library");
        System.out.println("It list of what I CAN");
        System.out.println("[1] --> add new Student");
        System.out.println("[2] --> add new book");
        System.out.println("[3] --> show all Students");
        System.out.println("[4] --> show all books");
        System.out.println("[5] --> give certain book to certain Student");
        System.out.println("[6] --> return a book back to the library from Student");
        System.out.println("[7] --> close app");
    }

    public void StudentsINFO(List<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Student list is empty");
            return;
        }
        list.forEach(Student::info);
    }


    public void booksINFO(List<Book> list) {
        if (list.isEmpty()) {
            System.out.println("Book list is empty");
            return;
        }
        list.forEach(Book::info);
    }


    public void addNewStudent(List<Student> StudentList) {
        System.out.println("Enter Student id");
        int id = in.nextInt();
        System.out.println("Enter Student name");
        String name = in.nextLine();
        name = in.nextLine();
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        StudentList.add(new Student(id, name));
        System.out.println("Student added");
    }

    public void addNewBook(List<Book> bookList) {
        System.out.println("Enter title of book");
        in.nextLine();
        String title = in.nextLine();
        System.out.println("Enter quantity");
        int quantity = in.nextInt();
        System.out.println("Enter author of book");
        String author = in.nextLine();
        author = in.nextLine();
        System.out.println("Enter year");
        int year = in.nextInt();
        System.out.println("enter isbn");
        in.nextLine();
        String isbn = in.nextLine();
        bookList.add(new Book(title, author, year, quantity ,isbn));
    }


    public void giveBook(List<Student> Students, List<Book> books) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < Students.size(); i++) {
            map.put(i + 1, Students.get(i).getName());
        }
        System.out.println(map);
        System.out.println("Choose Student by numeration");
        int n = in.nextInt();
        if(books.stream().noneMatch(i -> i.getQuantity()>0)){
            System.out.println("not enough books in library");
            return;
        }
        Map<Integer, String> m = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getQuantity()<1){
                continue;
            }
            m.put(i + 1, books.get(i).getTitle());
        }

        System.out.println(m);
        System.out.println("Choose a book by numeration");
        int p = in.nextInt();
        Students.get(n - 1).add(books.get(p - 1));
        books.get(p - 1).setQuantity(books.get(p - 1).getQuantity() - 1);
        System.out.println("Successful");
    }

    public void returnBook(List<Student> Students, List<Book> books) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < Students.size(); i++) {
            map.put(i + 1, Students.get(i).getName());
        }
        System.out.println(map);
        System.out.println("Choose Student by numeration");
        int n = in.nextInt();
        Map<Integer, String> m = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            m.put(i + 1, books.get(i).getTitle());
        }
        System.out.println(m);
        System.out.println("Choose a book by numeration");
        int p = in.nextInt();
        Students.get(n - 1).delete(books.get(p - 1));
        books.get(p - 1).setQuantity(books.get(p - 1).getQuantity() + 1);
        System.out.println("Book returned");
    }


    public void close(List<Student> Students, List<Book> books){
        System.out.println("Library closing");
        System.exit(0);
    }


}