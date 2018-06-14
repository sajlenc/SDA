package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, Number> columnId;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private Label labelId;

    @FXML
    private Label labelName;

    @FXML
    private Label labelAge;

    @FXML
    private MainWindow mainWindow;

    void setWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    void setList(ObservableList<Person> peopleList) {
        personTable.setItems(peopleList);
    }

    @FXML
    private void initialize(){
        nameColumn.setCellValueFactory(cell -> cell.getValue().nameProperty());
        columnId.setCellValueFactory(cell -> cell.getValue().idProperty());

        personTable.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Person>() {
                    @Override
                    public void changed(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
                        showPersonList(newValue);
                    }
                }
        );
        cleanLabels();
    }

    private void cleanLabels() {
        labelId.setText("");
        labelName.setText("");
        labelAge.setText("");
    }

    private void showPersonList(Person person) {
        if (person != null){
            labelId.setText(String.valueOf(person.getId()));
            labelName.setText(person.getName());
            labelAge.setText(String.valueOf(person.getAge()));
        } else {
            cleanLabels();
        }
    }

    @FXML
    private void deleteButtonPressed(){
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0){
            personTable.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void editButtonPressed(){
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        mainWindow.showPersonEditDialog(selectedPerson);
        showPersonList(selectedPerson);
    }
}
