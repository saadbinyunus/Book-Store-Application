/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528project;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

/**
 *
 * @author moham
 */
public class Owners  implements Users{
     String username ;
     String password ; 
     
    
     
     
    public Owners(String username, String password){
        this.username=username ;
        this.password=password ;
    }
    
   
    
  
   
    public boolean login(TextField username, TextField password){
       if(this.username.equals(username)&& this.password.equals(password)){
           return true ;
       }
       return false ;
    }  
    
    
    // can setScene on Button
    @Override
    public void back(){}
    
   
    
   // can setScene on Button
    public void logout(){} ;
    
   
    
    @Override
    public void deleteItem(CheckBox selection, ActionEvent event){}
    
    @Override
    public void addItem(ActionEvent e){}


}