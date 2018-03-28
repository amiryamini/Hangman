package hangman;

import javafx.scene.control.Button;

public class LetterButton extends Button {
    LetterButton(String text) {
        super(text);
        setMinWidth(40);
        setStyle("-fx-font-size: 20; -fx-background-color: white; -fx-border-radius: 0 0 0 0; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.2), 5, 0, 0, 0);");
    }

}
