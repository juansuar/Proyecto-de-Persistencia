package umg.edu.gt.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.edu.gt.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
