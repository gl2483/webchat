/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webchat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import webchat.model.ChatUser;

/**
 *
 * @author luoguanqi
 */
@Controller
public class UserController{
    
    
    @RequestMapping(value="/signup")
    public ModelAndView signup(){
        return new ModelAndView("signup");
    }
    
    @RequestMapping("/CreateAccount")
    public ModelAndView CreateAccount(@RequestParam("username") String usrname, @RequestParam("password") String password){
        
        ChatUser.createUser(usrname, password);
        return new ModelAndView("ChatClient");
    }
}
