/*
 * To changeicense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package coe528project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author moham
 */
public class addCustomers extends Owners {
    
    
     TextField usernameField ;
    TextField passwordField ;
    TextField pointsField ;
    
    
    String username = usernameField.getText() ;
    String password= passwordField.getText() ;
    String points = pointsField.getText() ;
  
   private final ObservableList<addCustomers> data =FXCollections.observableArrayList() ;
    private TableView<Books> table ;
    
     
    
    public addCustomers(String username, String password,String points){
         super(username,password) ;
         this.points=points ;
     }
     
    @Override
     public void addItem(ActionEvent e){
        data.add(new addCustomers(
                        usernameField.getText(),
                        passwordField.getText(),
                         pointsField.getText()));
               usernameField.clear();
                passwordField.clear();
                pointsField.clear() ;
                
                //MODIFICATION
            for (addCustomers num : data ) {
                if( num.usernameField.getText().equals(username)){
                    throw new IllegalArgumentException("Cant have same username");}
                if( num.usernameField.getText().equals("admin")){
                    throw new IllegalArgumentException("Customer cant be admin"); }
            }   
                
                
                
     }          
     
     @Override
     public void deleteItem(CheckBox selection, ActionEvent event){
        
        if (selection.isSelected()){
            table.getItems().removeAll(table.getSelectionModel().getSelectedItem()) ;
        }
    }
     // can use setScene on Button for this no need for method
     public void logout(){}
     
     
     
}