package lk.backend.repository;

import lk.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByEmailAndPassword(String email, String password);
}
