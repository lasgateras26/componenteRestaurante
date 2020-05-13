package com.alberto.componente;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import javax.swing.text.html.ImageView;
import java.awt.*;

public class Componente extends VBox {

    private IntegerProperty segundos = new SimpleIntegerProperty(0);

    public Componente() {
    }

    public Componente(double v) {
        super(v);
        TextField textField = new TextField();
        //this.getChildren().add(textField);
    }

    public Componente(Node... nodes) {
        super(nodes);
    }

    public Componente(double v, Node... nodes) {
        super(v, nodes);
    }

    public int getSegundos() {
        return segundos.get();
    }

    public IntegerProperty segundosProperty() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos.set(segundos);
    }
}
