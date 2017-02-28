package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FightController {
	
    @FXML
    Label whichWeapon;

    @FXML
    Label confirmText;

    @FXML
    Button proceed;
	
	@FXML
	Label axe;
	
	@FXML
	ImageView axeView;
	
	@FXML
	Label lance;
	
	@FXML
	ImageView lanceView;
	
	@FXML
	Label sword;
	
	@FXML
	ImageView swordView;
	
	
	Image axeIcon = new Image(getClass().getResourceAsStream("axe.jpg"));
	Image swordIcon = new Image(getClass().getResourceAsStream("sword.png"));
	Image lanceIcon = new Image(getClass().getResourceAsStream("lance.jpg"));
	
    @FXML
    void axe() {
        ConnectController.player.setWeapon(Weapon.axe);
        confirmChoice();
    }

    @FXML
    void lance() {
        ConnectController.player.setWeapon(Weapon.lance);
        confirmChoice();
    }

    @FXML
    void sword() {
        ConnectController.player.setWeapon(Weapon.sword);
        confirmChoice();
    }

    void confirmChoice() {
        confirmText.setVisible(false);
        if (ConnectController.player.getWeapon() == Weapon.axe) {
            confirmText.setText("Proceed using an " + ConnectController.player.getWeapon() + "?");
        } else {
            confirmText.setText("Proceed using a " + ConnectController.player.getWeapon() + "?");
        }
        confirmText.setLayoutX((450 - confirmText.getWidth()) / 2);
        confirmText.setVisible(true);
        proceed.setDisable(false);
        proceed.setVisible(true);
        
        proceed.setOnAction(event -> {startRound();});
    }
	
	@FXML
	void initialize(){
        whichWeapon.setText(ConnectController.player.getName() + ", which weapon will you use?");
		this.axeView.setImage(axeIcon);
		this.lanceView.setImage(lanceIcon);
		this.swordView.setImage(swordIcon);
		
		
		this.axeView.setOnMouseClicked(event -> axe());
		this.lanceView.setOnMouseClicked(event -> lance());
		this.swordView.setOnMouseClicked(event -> sword());
		
		this.confirmText.setVisible(false);
		
	}
	
	
	
    @FXML
    void startRound() {
    	proceed.getScene().getWindow().hide();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("RoundResults.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            RoundResultsController second = (RoundResultsController)loader.getController();

            Stage secondStage = new Stage();
            Scene scene = new Scene(root);
            secondStage.setScene(scene);
            secondStage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
	

}
