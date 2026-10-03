package com.example.kabaleskelet;

import javafx.scene.layout.Pane;
import java.util.Random;

/*
 * Klassen laver et oplæg af kort i et antal rækker og kolonner
 * Kortene gemmes i oplæg.
 * EK
 */

public class Oplæg {
    private Pane rod;
    private Kort[][] oplæg = new Kort[4][5];

    public Oplæg(Pane rod) {
        this.rod = rod;

        // Det er praktisk, hvis navnene på kortene passer med filnavnene
        String[] kortnavne = {
                "7_of_clubs", "7_of_diamonds", "7_of_hearts", "7_of_spades",
                "8_of_clubs", "8_of_diamonds", "8_of_hearts", "8_of_spades",
                "9_of_clubs", "9_of_diamonds", "9_of_hearts", "9_of_spades",
                "10_of_clubs", "10_of_diamonds", "10_of_hearts", "10_of_spades",
                "queen_of_clubs", "queen_of_diamonds", "queen_of_hearts", "queen_of_spades" };

        // bland listen
        bland(kortnavne);

        // Læg de blandede kort i et todim. oplæg
        int tæller = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<5; j++) {
                // Lav kort, gem det i oplægget og sæt det på scenen
                Kort kort = new Kort(kortnavne[tæller], j*120+20, i*40+20);
                oplæg[i][j] = kort;
                rod.getChildren().add(kort);
                ++tæller;
            }
        }
    }

    // Bland en eller anden liste af strenge...
    public void bland(String[] liste) {
        Random tilfældig = new Random();

        for (int i=0; i<liste.length; i++) {
            int tal = tilfældig.nextInt(liste.length);
            String temp = liste[i];
            liste[i] = liste[tal];
            liste[tal] = temp;
        }
    }
}
