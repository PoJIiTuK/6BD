package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Performer;
import ua.lviv.iot.repository.PerformerRepository;

@Service
public class PerformerService extends AbstractService<Performer, Integer> {
    @Autowired
    private PerformerRepository performerRepository;

    @Override
    public JpaRepository<Performer, Integer> getRepository() {
        return performerRepository;
    }

}