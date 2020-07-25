package ru.web.todolist.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.web.todolist.repr.UserRepr;

import javax.validation.Valid;

/**
 * регистрация и вход
 */


@Controller
public class LoginController {

    private static final Logger logger =LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user",new UserRepr());
        return "register";
    }

    @PostMapping("/register")
    public String registerNewUserPage(@ModelAttribute("user") @Valid UserRepr userRepr,
                                      BindingResult result){
        logger.info("New user {}",userRepr);
        if (result.hasErrors()){
            return "register";
        }
        if(!userRepr.getPassword().equals( userRepr.getMatchingPassword())){
            result.rejectValue("password","","Password not maching");
            return "register";
        }
        return "redirect:/login";
    }
}
