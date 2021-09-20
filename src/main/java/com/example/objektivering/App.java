package com.example.objektivering;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;


public class App extends javafx.application.Application {



    @Override
    public void start(Stage stage) {

        ReadCSV read = new ReadCSV();

        ArrayList<ArrayList<String>> values = read.readCSV();
        ArrayList<String> headers = values.get(0);


        TableView table = new TableView();

        ArrayList rowArrayList = new ArrayList();


        for (int i = 1; i < values.size(); i++) {
            rowArrayList.add(new TableObject(values.get(i)));
        }


        final ObservableList<TableObject> data =
                FXCollections.observableArrayList(
                        rowArrayList
                );



        for(int i = 0; i< headers.size(); i++){
            TableColumn column = new TableColumn(headers.get(i));
            column.setPrefWidth(75);

            column.setCellValueFactory(
                    new PropertyValueFactory<String,String>(headers.get(i)));

            table.setItems(data);
            table.getColumns().add(column);

        }

        table.editableProperty();

        final HBox hbox = new HBox();
        for(int i = 0; i< headers.size(); i++){
            final TextField valueTextField = new TextField();
            valueTextField.setPrefWidth(75);

            hbox.getChildren().add(valueTextField);

        }
        Button addBtn = new Button("Add values");
        hbox.getChildren().add(addBtn);




        addBtn.setOnAction(e -> {
            ArrayList<String> inputValues = new ArrayList<String>();
            for(int i = 0; i < headers.size(); i++){
                Node inputValue = hbox.getChildren().get(i);
                String inputValueString = ((TextField) inputValue).getText();
                inputValues.add(inputValueString);
            }

            values.add(inputValues);
            new TableObject(inputValues);
            data.add(new TableObject(inputValues));
            System.out.println(inputValues);
        });



        hbox.setSpacing(3);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        Label label = new Label();
        label.setText("Handling Data");
        vbox.getChildren().addAll( label, table, hbox);

        AnchorPane root = new AnchorPane();


        root.getChildren().add(vbox);

        Scene scene = new Scene(root, 720, 640);

        stage.setTitle("Dealing with CSV");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args)  {

    ReadCSV read = new ReadCSV();
    ArrayList<ArrayList<String>> data = read.readCSV();

        launch();
    }
}