package com.example.kabaleskelet;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*
 * Et spillekort har en forside med billede.
 * Kortet kan flyttes.
 * EK
 */

public class Kort extends ImageView {
    private Image billede;
    private double offsetX, offsetY;

    public Kort(String filnavn, int x, int y) {
        // Billedet skaleres med det samme til 100,150.
        billede = new Image(getClass().getResource(filnavn + ".png").toString(), 100, 150, false, false);

        setImage(billede);
        setX(x);
        setY(y);

        // Sæt events på så spilleren kan trække kortet...
        setOnMousePressed(event -> {
            toFront();  // Bringer kort frem forrest
            offsetX = event.getSceneX() - getX();
            offsetY = event.getSceneY() - getY();
        });

        // Mus-træk (flyt cirkel)
        setOnMouseDragged(event -> {
            // Husk, at checke om kortet ligger øverst før det evt flyttes...
            // Pas på at spilleren ikke kan smide kortene ud af vinduet...???
            setX(event.getSceneX() - offsetX);
            setY(event.getSceneY() - offsetY);
        });

        // Hvad skal der ske når man slipper kortet...?
        setOnMouseReleased(event -> {
            // ?
        });

    }
}
