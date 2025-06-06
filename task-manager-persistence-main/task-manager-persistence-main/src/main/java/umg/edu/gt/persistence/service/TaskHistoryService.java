package umg.edu.gt.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.gt.persistence.model.TaskHistory;
import umg.edu.gt.persistence.repository.TaskHistoryRepository;

import java.util.List;

@Service
public class TaskHistoryService {

    @Autowired
    private TaskHistoryRepository taskHistoryRepository;

    public TaskHistory save(TaskHistory history) {
        return taskHistoryRepository.save(history);
    }

    public List<TaskHistory> findAll() {
        return taskHistoryRepository.findAll();
    }

    public List<TaskHistory> findByTaskId(Long taskId) {
        return taskHistoryRepository.findAll()
            .stream()
            .filter(h -> h.getTask().getId().equals(taskId))
            .toList();
    }
}
