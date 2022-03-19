package backend.repository;

import backend.entity.Hobby;
import backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyRepository extends JpaRepository<Hobby, String> {
}
