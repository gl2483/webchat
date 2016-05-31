/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webchat.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import webchat.utilities.AES;

/**
 *
 * @author KK
 */
public class ChatUser {
    private int UserId;
    private String Username;
    private String Password;
    
    public ChatUser(){}
    public ChatUser(int userid, String name, String pwd){
        UserId = userid;
        Username = name;
        Password = pwd;
    }
    
    public int getUserId(){
        return UserId;
    }
    
    public void setUserId(int id){
        UserId = id;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public void setUsername(String name){
        Username = name;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String pwd){
        try{
            Password = AES.encrypt(pwd);
        }
        catch(Exception ex){
            Logger.getLogger(ChatUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
