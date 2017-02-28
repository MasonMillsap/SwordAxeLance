package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RoundResultsController {
	
	@FXML
	Label roundNumber;
	
	@FXML
	Label chosenWeaponP1;
	
	@FXML
	Label chosenWeaponP2;
	
	@FXML
	Label lossP1;
	
	@FXML
	Label lossP2;
	
	@FXML
	Label currentScoreP1;
	
	@FXML
	Label currentScoreP2;
	
	@FXML
	void nextRound() {
		roundNumber.getScene().getWindow().hide();
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Fight.fxml"));
			AnchorPane root = (AnchorPane) loader.load();

			FightController second = (FightController)loader.getController();

			Stage secondStage = new Stage();
			Scene scene = new Scene(root);
			secondStage.setScene(scene);
			secondStage.show();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	@FXML
	void initialize(){
		roundNumber.setText("ROUND 1");
	}

}
