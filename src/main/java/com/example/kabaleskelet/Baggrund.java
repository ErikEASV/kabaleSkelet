package com.example.kabaleskelet;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/*
 * Klassen sætter baggrunden for kabalen op
 * EK
 */



public class Baggrund {
    public Baggrund(Pane rod) {

        // Enkel farve sættes på baggrunden
        BackgroundFill bf = new BackgroundFill(Color.BISQUE, null, null);
        Background b = new Background(bf);
        rod.setBackground(b);

        // Måske skal baggrunden animeres med noget, der roligt bevæger sig? (med en transition)

    }
}
