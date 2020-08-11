package ru.web.todolist.persisit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.web.todolist.persisit.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
