/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProductDevelopmentCoordinator;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Promit
 */
public class NotificationController implements Initializable {

    @FXML
    private TextArea notificationTextArea;
    @FXML
    private TextField enterYourMessageTextField;
    @FXML
    private ComboBox<String> selectNameComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ProductDevelopmentCoordinatorDashboard.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductDevelopmentCoordinatorDashboardController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void ViewNotificationButtonOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void SendMessageButtonOnMouseClick(ActionEvent event) {
    }
    
}
