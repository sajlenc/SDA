package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.personDialogController.PersonDialogController;

import java.io.IOException;
import java.util.Arrays;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainWindow.class.getResource("sample.fxml"));
//                .load(getClass().getResource("sample.fxml"));
        AnchorPane anchorPane = loader.load();

        Controller controller = loader.getController();
        controller.setWindow(this);
        controller.setList(getPeopleList());

        Scene scene = new Scene(anchorPane);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private ObservableList<Person> getPeopleList() {
        ObservableList<Person> personList = FXCollections.observableArrayList();
        personList.addAll(Arrays.asList(
                new Person("Kamil", 20),
                new Person("Robert", 21),
                new Person("Ania", 25),
                new Person("Zosia", 12)
        ));

        return personList;
    }

    void showPersonEditDialog(Person person) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainWindow.class.getResource("personDialogController/person_dialog_controller.fxml"));

        try {
            AnchorPane anchorPane = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Edit person");
            stage.initModality(Modality.WINDOW_MODAL);

            Scene scene = new Scene(anchorPane);
            stage.setScene(scene);

            PersonDialogController controller = loader.getController();
            controller.setDialogStage(stage);
            controller.setPerson(person);

            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
