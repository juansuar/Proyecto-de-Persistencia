package umg.edu.gt.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.edu.gt.persistence.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
