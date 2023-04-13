package com.coresrevisao.coresrevisao;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Arrays;
import java.util.Comparator;

public class AppController {

    private Cor[] cores;

    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label l4;
    @FXML
    private Label l5;
    @FXML
    private Label l6;
    @FXML
    private Label l7;
    @FXML
    private Label l8;
    @FXML
    private Label l9;
    @FXML
    private Label l10;
    @FXML
    private Label l11;
    @FXML
    private Label l12;

    @FXML
    public void ordenarCores() {
        Arrays.sort(cores, Comparator.comparingInt(Cor::getSomaRGB));
        
        colorirLabelsOrdenados();

    }   
    
    @FXML
    public void ordenarCores2() {
        //AO CONTRARIO
        Arrays.sort(cores, Comparator.comparingInt(Cor::getSomaRGB).reversed());
        
        colorirLabelsOrdenados();

    }   
    

    @FXML
    public void iniciarVetorCores() {
        cores = new Cor[6];
        for (int i = 0; i < cores.length; i++) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            cores[i] = new Cor(r, g, b);
        }
        colorirLabels();

    }

    private void colorirLabels() {

        l1.setStyle("-fx-background-color: " + cores[0].getRGB() + ";");
        l2.setStyle("-fx-background-color: " + cores[1].getRGB() + ";");
        l3.setStyle("-fx-background-color: " + cores[2].getRGB() + ";");
        l4.setStyle("-fx-background-color: " + cores[3].getRGB() + ";");
        l5.setStyle("-fx-background-color: " + cores[4].getRGB() + ";");
        l6.setStyle("-fx-background-color: " + cores[5].getRGB() + ";");

    }

    private void colorirLabelsOrdenados() {

        l7.setStyle("-fx-background-color: " + cores[0].getRGB() + ";");
        l8.setStyle("-fx-background-color: " + cores[1].getRGB() + ";");
        l9.setStyle("-fx-background-color: " + cores[2].getRGB() + ";");
        l10.setStyle("-fx-background-color: " + cores[3].getRGB() + ";");
        l11.setStyle("-fx-background-color: " + cores[4].getRGB() + ";");
        l12.setStyle("-fx-background-color: " + cores[5].getRGB() + ";");

    }

}
