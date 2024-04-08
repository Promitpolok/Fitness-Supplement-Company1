package SupplyChainCoordinator;

import Login.Login_InterfaceController;
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
 * @author Promit
 */
public class DashboardSupplyChainCoordinatorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OverViewButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Overview.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

OverviewController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show();    
    
    }
    

    @FXML
    private void ProductQuantityButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Product Quantity.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductQuantityController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void ProductPriceButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Product Price.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ProductPriceController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void StockLevelButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Stock Levels.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

StockLevelsController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void SignOutButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/Login/Login_Interface.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

Login_InterfaceController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void InventoryManagementButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Inventory Management.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

InventoryManagementController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void ViewCostButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("View Cost.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

ViewCostController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }

    @FXML
    private void NotificationButtonOnMouseClick(ActionEvent event) throws IOException {
        
        Parent root = null;
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Notification.fxml"));
root = (Parent) myLoader.load();
Scene myScene = new Scene(root);

NotificationController x = myLoader.getController();
//x.setValue(value);

Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
myStage.setScene(myScene);
myStage.show(); 
    }
    
}
