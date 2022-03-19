package backend.repository;

import backend.entity.HobbyInfo;
import backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyInfoRepository extends JpaRepository<HobbyInfo, String> {
}
