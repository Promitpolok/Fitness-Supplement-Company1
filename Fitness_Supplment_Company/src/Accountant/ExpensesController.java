/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Accountant;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ExpensesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException { 
                Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Accountant.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

AccountantController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void viewExpensesButtonMouseOnClick(ActionEvent event) {
    }

    @FXML
    private void createExpenseButtonMouseOnClick(ActionEvent event) throws IOException { 
                Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("CreateExpense.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

CreateExpenseController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();  
    }

    @FXML
    private void viewExpensesInBerButtonMouseOnClick(ActionEvent event) {
    }
    
}
