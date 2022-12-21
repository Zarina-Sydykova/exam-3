import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = {new Student(1L, "Zarina", "Sydykova",
                LocalDate.of(1995, 7, 11), Gender.FEMALE, "0507579095"),
                new Student(2L, "Rahim", "Bazarbay uulu",
                        LocalDate.of(2003, 11, 24), Gender.MALE, "0555781465"),
                new Student(3L, "Nurlan", "Nurseiit uulu",
                        LocalDate.of(1992, 3, 3), Gender.MALE, "0507579109"),
                new Student(1L, "Damira", "Jamalova",
                        LocalDate.of(1997, 5, 11), Gender.FEMALE, "0507165795")
        };
        StudentServiceImpl service = new StudentServiceImpl();

        while (true) {
            int action = sc.nextInt();
            switch (action){
                case 1-> System.out.println(service.createStudents(List.of(students)));
                case 2-> System.out.println(service.findAll());
                case 3-> System.out.println(service.removeName(sc.nextLine()));
                case 4-> System.out.println(service.findById(sc.nextLong()));
                case 5-> System.out.println(service.getAge());
                case 6-> System.out.println(service.getByName());
                case 7-> System.out.println(service.groupingByGender());
            }


        }
    }
}