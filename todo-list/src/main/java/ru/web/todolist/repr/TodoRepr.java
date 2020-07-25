package ru.web.todolist.repr;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * модель данных представления для записей todo
 *
 */
public class TodoRepr {

    private  long id;

    @NotNull
    private String description;

     private String  username;


    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private LocalDate targetDate;

    public TodoRepr() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate=targetDate;
    }
}
