package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ConnectController {
    static Fighter player = new Fighter();

    @FXML
    Button connect;

    @FXML
    TextField fighterName;

    @FXML
    TextField user2Ip;

    @FXML
    TextField portNum;

    @FXML
    Button continueGame;



    //@FXML
//    void nameFighter() {
//        player.setName(fighterName.getText());
//        fighterName.setEditable(false);
//        beginFight.setDisable(false);
//        beginFight.setVisible(true);
//    }

    @FXML
    void beginFight() {
        //beginFight.getScene().getWindow().hide();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("ChooseClass.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            ChooseController second = (ChooseController)loader.getController();

            Stage secondStage = new Stage();
            Scene scene = new Scene(root);
            secondStage.setScene(scene);
            secondStage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        connect.setOnAction(event ->  {
            user2Ip.setVisible(true);
            portNum.setVisible(true);
            continueGame.setVisible(true);
        });

        continueGame.setOnAction(event -> beginFight());

    }

}



