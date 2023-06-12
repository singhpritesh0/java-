package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class first extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
// Create a scene and place a button in the scene
Button btOK = new Button("Welcome");
Scene scene = new Scene(btOK, 450, 550);
primaryStage.setTitle("MyJavaFX first program"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}
public static void main(String[] args) {
Application.launch(args);
}
}
