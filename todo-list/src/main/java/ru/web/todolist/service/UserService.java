package ru.web.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.web.todolist.persisit.entity.User;
import ru.web.todolist.persisit.repo.UserRepository;
import ru.web.todolist.repr.UserRepr;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public void create(UserRepr userRepr){
        User user = new User();
        user.setPassword(userRepr.getPassword());
        user.setUsername(userRepr.getUsername());
        userRepository.save(user);
    }

}
