package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.User;
import ua.lviv.iot.repository.UserRepository;

@Service
public class UserService extends AbstractService<User, Integer> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }

}