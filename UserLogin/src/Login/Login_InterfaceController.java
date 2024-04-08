
package Login;

import ProductDevelopmentCoordinator.ProductDevelopmentCoordinatorDashboardController;
import SupplyChainCoordinator.DashboardSupplyChainCoordinatorController;
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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.lang.model.util.Elements;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class Login_InterfaceController implements Initializable {
    
    private Label label;
    @FXML
    private ComboBox<String> userNameComboBox;
    @FXML
    private TextField userIdTextField;
    @FXML
    private PasswordField enterPasswordField;
    @FXML
    private Label resetPassLabel;
    
    Alert anAlert = new Alert(Alert.AlertType.ERROR);
    
    
    private ArrayList <UserName> UserList;
    @FXML
    private Rectangle userTypeComboBox;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        UserList= new ArrayList<>();
        
        userNameComboBox.getItems().addAll(
                "Supply Chain Coordinator", 
                "Product Development Coordinator", 
                "Accountant",
                "Digital Marketing Executive",
                "CEO",
                "Warehouse Associate", 
                "Buyer", 
                "Customer Support Specialist");
        
    }
    @FXML
    private void loginButtonOnMouseClick(ActionEvent event) throws IOException {
        if(userNameComboBox.getValue() == null) {
            anAlert.setContentText("Select a user type first");
            anAlert.showAndWait();
    
        }
        else if(userIdTextField.getText().isEmpty()) {
            anAlert.setContentText("Enter a user ID and a password to login");
            anAlert.showAndWait();
            
        }
        
        else if(enterPasswordField.getText().isEmpty()) {
            anAlert.setContentText("Enter a user ID and a password to login");
            anAlert.showAndWait();
            
        }    
        else {
            if(userNameComboBox.getValue().equals("Product Development Coordinator")) {
                
                Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ProductDevelopmentCoordinatorDashBoard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductDevelopmentCoordinatorDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 


        }
        else {
            anAlert.setAlertType(Alert.AlertType.ERROR);
            anAlert.setContentText("Oops! The combination of userId and password is incorrect or something else went wrong. Try again!");
            anAlert.show();
            
        }   

        if(userNameComboBox.getValue().equals("Supply Chain Coordinator")) {
                
                Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Dashboard Supply Chain Coordinator.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

DashboardSupplyChainCoordinatorController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();
        

        }
        else {
            anAlert.setContentText("Oops! The combination of userId and password is incorrect or something else went wrong. Try again!");
            anAlert.show();
                
            }
        }
    }

    @FXML
    private void registerButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("RegisterUserScene.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

RegisterUserSceneController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }
}    
