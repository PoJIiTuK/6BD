package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Information;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {
}