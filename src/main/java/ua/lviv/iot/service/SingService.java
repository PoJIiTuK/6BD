package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Sing;
import ua.lviv.iot.repository.SingRepository;

@Service
public class SingService extends AbstractService<Sing, Integer> {
    @Autowired
    private SingRepository singRepository;

    @Override
    public JpaRepository<Sing, Integer> getRepository() {
        return singRepository;
    }

}