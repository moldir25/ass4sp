import java.util.List;
import java.util.Scanner;

public class SecurityLibraryDecorator implements LibraryDecorator {
    private LibraryService library;

    public SecurityLibraryDecorator(LibraryService library) {
        this.library = library;
    }

    private boolean isAuthorized() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter password for authorization: ");
            String password = scanner.nextLine();

            // Check if the password matches a predefined password (for demonstration).
            String predefinedPassword = "moly";
            boolean authorized = password.equals(predefinedPassword);

            if (!authorized) {
                System.out.println("Authorization failed. Access denied.");
            }

            return authorized;
        }

    @Override
    public void LibraryInfo() {
        if (isAuthorized()) {
            library.LibraryInfo();
        } else {
            System.out.println("Not authorized to access LibraryInfo");
        }
    }

    @Override
    public void StudentsINFO(List<Student> list) {
        if (isAuthorized()) {
            library.StudentsINFO(list);
        } else {
            System.out.println("Not authorized to access StudentsINFO");
        }
    }

    @Override
    public void booksINFO(List<Book> list) {
        if (isAuthorized()) {
            library.booksINFO(list);
        } else {
            System.out.println("Not authorized to access booksINFO");
        }
    }

    @Override
    public void addNewStudent(List<Student> StudentList) {
        if (isAuthorized()) {
            library.addNewStudent(StudentList);
        } else {
            System.out.println("Not authorized to add new student");
        }
    }

    @Override
    public void addNewBook(List<Book> bookList) {
        if (isAuthorized()) {
            library.addNewBook(bookList);
        } else {
            System.out.println("Not authorized to add new book");
        }
    }

    @Override
    public void giveBook(List<Student> Students, List<Book> books) {
        if (isAuthorized()) {
            library.giveBook(Students, books);
        } else {
            System.out.println("Not authorized to give a book");
        }
    }

    @Override
    public void returnBook(List<Student> Students, List<Book> books) {
        if (isAuthorized()) {
            library.returnBook(Students, books);
        } else {
            System.out.println("Not authorized to return a book");
        }
    }

    @Override
    public void close(List<Student> studentList, List<Book> bookList) {
        if (isAuthorized()) {
            library.close(studentList, bookList);
        } else {
            System.out.println("Not authorized to close the library");
        }
    }
}
