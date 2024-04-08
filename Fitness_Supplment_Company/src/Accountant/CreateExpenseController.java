/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Accountant;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CreateExpenseController implements Initializable {

    @FXML
    private ComboBox<String> spendReasonComboBox;
    @FXML
    private TextField amountTextField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> spendReasonTableColumn;
    @FXML
    private TableColumn<?, ?> amountTableColumn;
    @FXML
    private TableColumn<?, ?> dateTableColumn; 
    
    private ArrayList <ExpenseReason> expensesReasonList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
                expensesReasonList = new ArrayList<>();
                spendReasonComboBox.getItems().addAll(
                       "Electricity Bill",
                       "Water Bill",
                       "Gas Bill",
                       "Internet and Phone Services",
                       "Cleaning and Maintenance Services",
                       "Raw Materials",
                       "Manufacturing Costs",
                       "Packaging",
                       "Marketing and Advertising",
                       "Distribution and Logistics",
                       "Regulatory Compliance",
                       "Employee Salaries",
                       "Customer Support",
                       "Market Research",
                       "Product Liability Insurance"
                );
                
        // TODO
    }    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException { 
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Expenses.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ExpensesController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();  
    }

    @FXML
    private void addButtonMouseOnClick(ActionEvent event) {
    }

    private static class ExpenseReason {

        public ExpenseReason() {
        }
    }
    
}
