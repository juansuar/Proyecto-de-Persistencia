package umg.edu.gt.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.edu.gt.persistence.model.TaskHistory;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Long> {
}
