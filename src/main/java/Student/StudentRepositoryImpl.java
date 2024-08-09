package Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private List<Students> students = new ArrayList<>();

    public StudentRepositoryImpl() {
        // Khởi tạo danh sách với ít nhất 2 học sinh ban đầu
        students.add(new Students(1, "Nguyen Van A"));
        students.add(new Students(2, "Tran Thi B"));
    }

    @Override
    public List<Students> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    @Override
    public void update(Students student) {
        for (Students s : students) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                break;
            }
        }
    }

    @Override
    public void insert(Students student) {
        students.add(student);
    }
}
