package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Sing;
import ua.lviv.iot.service.SingService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/sing")
public class SingController extends AbstractController<Sing, Integer> {

    @Autowired
    SingService singService;

    @Override
    public GeneralServiceInterface<Sing, Integer> getService() {
        return singService;
    }

}