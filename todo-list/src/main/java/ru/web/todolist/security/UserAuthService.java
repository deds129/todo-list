package ru.web.todolist.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.web.todolist.persisit.entity.User;
import ru.web.todolist.persisit.repo.UserRepository;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Optional;
@Service
@Transactional
public class UserAuthService  implements UserDetailsService {

    private  final UserRepository userRepository;

    public UserAuthService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //извлекаем пользователя ПО ИМЕНИ! (а не по id)
        Optional<User> optUser =userRepository.getUserByUsername(username);
        if(!optUser.isPresent()){
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(
                optUser.get().getUsername(),
                optUser.get().getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("USER"))
        );
    }
}