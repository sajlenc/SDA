package sample.personDialogController;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Person;

public class PersonDialogController {
    @FXML
    private TextField fieldName;
    @FXML
    private TextField fieldId;
    @FXML
    private TextField fieldAge;

    private Stage dialogStage;

    private Person person;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setPerson(Person person) {
        this.person = person;

        showData();
    }

    private void showData() {
        fieldId.setText(String.valueOf(person.getId()));
        fieldName.setText(person.getName());
        fieldAge.setText(String.valueOf(person.getAge()));
    }

    @FXML
    private void saveButtonPressed(){
        person.setName(fieldName.getText());
        person.setAge(Integer.parseInt(fieldAge.getText()));

        dialogStage.close();
    }
}
