package de.example.controller;

import de.example.model.Student;
import de.example.model.StudentDB;
import de.example.model.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("student")

public class StudentController {
//    private final StudentDB studentsDb = new StudentDB(new Student[]
//            {       new Student("Alex", 1),
//                    new Student("Timo", 2),
//                    new Student("Florian", 3),
//                    new Student("Selin", 4)});

    private final StudentService service = new StudentService();

    @GetMapping()
    public List<Student> getStudents(StudentService service){
        return service.getStudentsList();
    }

//    @GetMapping()
//    public Student[] getStudents() {
//        return studentsDb.getStudentArray();
//    }

    @GetMapping("{id}")
    public Student getStudentbyId(@PathVariable int id){
        return service.getStudentById(id);
    }

//    @GetMapping("{id}")
//    public Student getStudent(@PathVariable Integer id) {
//        for (Student x : studentsDb.getStudentArray()) {
//            if (x.getId() == id) {
//                return x;
//            }
//        }
//        System.out.print("Student nicht vorhanden");
//        return null;
//    }
    }
