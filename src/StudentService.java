import java.util.List;

public interface StudentService {
    List<Student> createStudents(List<Student>students);
    List<Student> findAll();
    Student removeName(String name);
    Student findById(Long id);
    Student getAge();
    Student getByName();
    List<Student>groupingByGender();
}
