package ru.web.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.web.todolist.persisit.entity.User;
import ru.web.todolist.persisit.repo.UserRepository;
import ru.web.todolist.repr.UserRepr;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;
    }

    public void create(UserRepr userRepr){
        User user = new User();
        user.setPassword(passwordEncoder.encode(userRepr.getPassword())); //сохранение в закодированном виде
        user.setUsername(userRepr.getUsername());
        userRepository.save(user);
    }

}
