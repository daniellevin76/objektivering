package com.example.objektivering;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

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

        //TableObject tableObject = new TableObject(headers);
        for (ArrayList<String> value: values)
        {
            rowArrayList.add(new TableObject(value));
        }

        final ObservableList<ArrayList<String>> data =
                FXCollections.observableArrayList(
                        rowArrayList
                );



        for(int i = 0; i< headers.size(); i++){
            TableColumn column = new TableColumn(headers.get(i));


            column.setCellValueFactory(
                    new PropertyValueFactory<String,String>(headers.get(i)));


            ArrayList<String> col = values.get(i);
            for(int j = 0; j<col.size(); j ++){
             //   column.setCellValueFactory();
            }
            table.setItems(data);
            table.getColumns().add(column);

        }

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        Label label = new Label();
        label.setText("Handling Data");
        vbox.getChildren().addAll(label, table);

        AnchorPane root = new AnchorPane();

        root.getChildren().add(vbox);
        Scene scene = new Scene(root, 680, 620);

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