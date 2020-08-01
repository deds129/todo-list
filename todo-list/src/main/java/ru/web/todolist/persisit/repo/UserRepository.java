package ru.web.todolist.persisit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.web.todolist.persisit.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    boolean existByUserName(String username);
    Optional<User> getUserByUsername(String username);
}
