package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Information;
import ua.lviv.iot.service.InformationService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/information")
public class InformationController extends AbstractController<Information, Integer> {

    @Autowired
    InformationService informationService;

    @Override
    public GeneralServiceInterface<Information, Integer> getService() {
        return informationService;
    }

}