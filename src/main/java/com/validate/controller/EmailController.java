package com.validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    private static Pattern pattern;

    private Matcher matcher;

    public EmailController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/")
    public String getIndex(){
        return "/index";
    }

    @PostMapping("/validate")
    public String validateEmail(@RequestParam("email") String email, Model model){
        boolean isValidate = isValidate(email);
        if (isValidate) {
            model.addAttribute("message", "true");
        } else {
            model.addAttribute("message", "false");
        }
        return "/index";
    }

    public boolean isValidate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
