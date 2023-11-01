import java.util.List;

public interface LibraryService {
    void LibraryInfo();
    void StudentsINFO(List<Student> list);
    void booksINFO(List<Book> list);
    void addNewStudent(List<Student> StudentList);
    void addNewBook(List<Book> bookList);

    void giveBook(List<Student> Students, List<Book> books);

     void returnBook(List<Student> Students, List<Book> books);

    void close(List<Student> studentList, List<Book> bookList);
}
