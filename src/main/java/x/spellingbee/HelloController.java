package x.spellingbee;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class HelloController {


    public static void main(String[] args) {
    Random random = new Random();

    char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);
    //@FXML
        //private Label welcomeText;

    //@FXML
    //protected void onHelloButtonClick() {
      //  welcomeText.setText("Welcome to JavaFX Application!");
    }
}
