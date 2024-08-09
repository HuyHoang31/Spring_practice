package Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private  StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Students student) {
        studentRepository.insert(student);
    }

    public void updateStudent(Students student) {
        studentRepository.update(student);
    }

    public void deleteStudent(int id) {
        studentRepository.delete(id);
    }

}
