package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.User;
import ua.lviv.iot.service.UserService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/user_profile")
public class UserController extends AbstractController<User, Integer> {

    @Autowired
    UserService userService;

    @Override
    public GeneralServiceInterface<User, Integer> getService() {
        return userService;
    }

}