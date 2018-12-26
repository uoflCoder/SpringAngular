package com.userfront.controllers;

import com.userfront.models.User;
import com.userfront.services.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController
{
    @RequestMapping({"/", "/index", "/home"})
    public String home()
    {
        return "index";
    }

    @RequestMapping(value="/signup", method = RequestMethod.GET)
    public String signup(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);

        return "signup";
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public void signup(@Autowired SignupService signupService)
    {
       signupService.signup();
    }
}
