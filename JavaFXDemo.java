/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 6316704
 */
public class JavaFXDemo extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        root.setCenter(grid);
        
        Scene scene = new Scene(root, 300, 275);
        
        Label firstName = new Label("First Name: ");
        grid.add(firstName, 0, 0);
        
        Label lastName = new Label("Last Name: ");
        grid.add(lastName, 0, 1);
        
        Label email = new Label("Email: ");
        grid.add(email, 0, 2);
        
        Label pw = new Label("Password: ");
        grid.add(pw, 0 , 3);
        
        primaryStage.setTitle("User Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
