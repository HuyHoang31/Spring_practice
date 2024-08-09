package Student;

import java.util.List;

public interface StudentRepository {
    List<Students> findAll();
    void delete(int id);
    void update(Students student);
    void insert(Students student);
}
