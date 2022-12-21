import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class StudentServiceImpl implements StudentService{
    List<Student>studentList= new ArrayList<>();
    @Override
    public List<Student> createStudents(List<Student> students) {
        this.studentList.addAll(students);
        return this.studentList;
    }

    @Override
    public List<Student> findAll() {
        return this.studentList;
    }

    @Override
    public Student removeName(String name) {
        for (Student student : studentList) {
            if (student.getName().equals(name)){
                studentList.remove(student);
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findById(Long id) {
        for (Student student : studentList) {
            if (student.getId().longValue()==id){
                studentList.add(student);
            }
        }return (Student) studentList;
    }

    @Override
    public Student getAge() {
        Map<Integer, Student>studentsYears=new TreeMap<>();
        for (Student student:studentList) {
            int a = Period.between(student.getDateOfBirth(), LocalDate.now()).getYears();
            studentsYears.put(a, student);

        }
        return null;
    }

    @Override
    public Student getByName() {

        return studentList.stream().filter(student -> student.getName().equals(name)).findAny().orElseThrow();
    }

    @Override
    public List<Student> groupingByGender() {
        studentList.stream().filter(student -> student.getGender().equals(Gender.FEMALE)).toList();
        studentList.forEach(System.out::println);
        studentList.stream().filter(student -> student.getGender().equals(Gender.MALE)).toList();
        studentList.forEach(System.out::println);
        return null;
    }
}
