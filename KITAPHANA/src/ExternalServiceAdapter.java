import java.util.List;

public interface ExternalServiceAdapter {
    List<Book> fetchBooksFromExternalService();
    Student fetchStudentInfoFromExternalService(int studentId);
}
