package ua.lviv.iot.service;

import ua.lviv.iot.repository.InformationRepository;
import ua.lviv.iot.domain.Information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InformationService extends AbstractService<Information, Integer> {

    @Autowired
    private InformationRepository informationRepository;

    @Override
    public JpaRepository<Information, Integer> getRepository() {
        return informationRepository;
    }

}