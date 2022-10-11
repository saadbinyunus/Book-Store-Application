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
public class customerView implements Users{
    String username ;
    String password ;
    int points ;
     double totalPrice ;
    
    public customerView(String username, String password, int points){
        this.username = username ;
        this.password= password  ;
        this.points= points ;
        
    }
    

    // can use setScene on Button for this no need for method
    @Override
    public void logout(){}
    
    @Override
    public boolean login(TextField username, TextField password){
       if(this.username.equals(username)&& this.password.equals(password)){
           return true ;
       }
       return false ;
    }  
    
    //MODIFICATION
    public static void readfile(){
        
        
        String this.username = "" ;
        String this.password = "";
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    public double buy(Books b1, CheckBox selection){
        
        double totalPrice=0 ;
        if(selection.isSelected()){
           totalPrice= Double.parseDouble(b1.bookPrice) ;
        }
        
            return totalPrice ;
        
    }
    
    @Override
    public void deleteItem(CheckBox selection, ActionEvent event){} ;
    
    @Override
    public  void addItem(ActionEvent e){};

  public double buyRedeem(Books b1, CheckBox selection){
  double totalPrice=0 ;
  if(selection.isSelected()){
      totalPrice = Double.parseDouble(b1.bookPrice) -(points*0.01) ;
  }
  return totalPrice ;
  }
  
  @Override
    // can use setScene on Button for this no need for method
    public void back(){}
    
    
}