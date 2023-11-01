import java.util.List;

public class LoggingLibraryDecorator implements LibraryDecorator {
    private LibraryService library;

    public LoggingLibraryDecorator(LibraryService library) {
        this.library = library;
    }

    @Override
    public void LibraryInfo() {
        System.out.println("Logging: LibraryInfo()");
        library.LibraryInfo();
    }

    @Override
    public void StudentsINFO(List<Student> list) {
        System.out.println("Logging: StudentsINFO()");
        library.StudentsINFO(list);
    }

    @Override
    public void booksINFO(List<Book> list) {
        System.out.println("Logging: booksINFO()");
        library.booksINFO(list);
    }

    @Override
    public void addNewStudent(List<Student> StudentList) {
        System.out.println("Logging: addNewStudent()");
        library.addNewStudent(StudentList);
    }

    @Override
    public void addNewBook(List<Book> bookList) {
        System.out.println("Logging: addNewBook()");
        library.addNewBook(bookList);
    }

    @Override
    public void giveBook(List<Student> Students, List<Book> books) {
        System.out.println("Logging: giveBook()");
        library.giveBook(Students, books);
    }

    @Override
    public void returnBook(List<Student> Students, List<Book> books) {
        System.out.println("Logging: returnBook()");
        library.returnBook(Students, books);
    }

    @Override
    public void close(List<Student> studentList, List<Book> bookList) {
        System.out.println("Logging: close()");
        library.close(studentList, bookList);
    }
}
