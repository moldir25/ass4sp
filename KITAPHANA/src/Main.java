import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singleton meat = Singleton.getInstance();
        List<Book> bookList = new ArrayList<>();
        List<Student> StudentList = new ArrayList();
        ExternalServiceAdapter externalServiceAdapter = new LibraryAdapter(); // Вам нужно заменить это на ваш реальный класс адаптера


        Library library = new Library(externalServiceAdapter);
        LibraryDecorator loggingLibrary = new LoggingLibraryDecorator(library); // Wrap the original library with the decorator
        LibraryDecorator securedLibrary = new SecurityLibraryDecorator(loggingLibrary);
        loggingLibrary.LibraryInfo();


        while (true) {
            System.err.println("Enter key number");
            int n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1 -> securedLibrary.addNewStudent(StudentList);
                case 2 -> loggingLibrary.addNewBook(bookList);
                case 3 -> securedLibrary.StudentsINFO(StudentList);
                case 4 -> loggingLibrary.booksINFO(bookList);
                case 5 -> securedLibrary.giveBook(StudentList, bookList);
                case 6 -> loggingLibrary.returnBook(StudentList, bookList);
                case 7 -> loggingLibrary.close(StudentList, bookList);
                default -> System.out.println("Incorrect number");
            }
        }
    }
}

