package de.example.model;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> studentsList = new ArrayList<>(List.of(
            new Student("Alex", 1),
            new Student("Timo", 2),
            new Student("FLorian", 1337)));

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public Student getStudentById(Integer id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (id == studentsList.get(i).getId()) {
                return studentsList.get(i);
            }
        }
        throw new IllegalArgumentException();
    }
}
