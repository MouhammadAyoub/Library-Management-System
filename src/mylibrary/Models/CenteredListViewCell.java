package mylibrary.Models;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class CenteredListViewCell extends ListCell<String> {

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
            // Create the HBox
            HBox hBox = new HBox();
            hBox.setAlignment(Pos.CENTER);

            // Create centered Label
            Label label = new Label(item);
            label.setAlignment(Pos.CENTER);
            // create Button Borrow

            hBox.getChildren().add(label);

            setGraphic(hBox);

        }
    }

}
