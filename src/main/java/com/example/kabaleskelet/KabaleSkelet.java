package com.example.kabaleskelet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/*
 * Enkelt skelet til kabale.
 * Der vises et antal kort lagt i rækker ovenpå hinanden og kortene kan flyttes
 * EK okt. 2026
 */

public class KabaleSkelet extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane rod = new Pane();
        Scene scene = new Scene(rod, 700, 400);

        Baggrund baggrund = new Baggrund(rod);
        Oplæg kabale = new Oplæg(rod);

        stage.setTitle("Min kabale");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}