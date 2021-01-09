package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ua.lviv.iot.domain.Performer;

import ua.lviv.iot.service.PerformerService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/performer")
public class PerformerController extends AbstractController<Performer, Integer> {

    @Autowired
    PerformerService performerService;

    @Override
    public GeneralServiceInterface<Performer, Integer> getService() {
        return performerService;
    }

}