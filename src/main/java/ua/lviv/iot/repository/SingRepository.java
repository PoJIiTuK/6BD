package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Sing;

@Repository
public interface SingRepository extends JpaRepository<Sing, Integer> {
}