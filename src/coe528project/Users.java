/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528project;


import javafx.event.ActionEvent;
import coe528project.Books;
import java.util.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
/**
 *
 * @author moham
 */
 public interface Users  {
    
 public abstract boolean login(TextField username, TextField password) ;
  public abstract void addItem(ActionEvent e);
  public abstract void deleteItem(CheckBox selection, ActionEvent event);
  public abstract void logout() ;
  
  
  public abstract void back() ;

  
    
}