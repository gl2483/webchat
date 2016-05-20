/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webchat.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author luoguanqi
 */
public class ChatClientController implements Controller{
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        return new ModelAndView("ChatClient");
    }
    
}
