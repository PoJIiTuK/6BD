package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Performer;

@Repository
public interface PerformerRepository extends JpaRepository<Performer, Integer> {
}