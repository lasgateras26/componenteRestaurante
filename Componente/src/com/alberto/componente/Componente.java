package com.alberto.componente;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Componente extends VBox {

    private IntegerProperty segundos = new SimpleIntegerProperty(0);

    //TextField textField = new TextField();

    public Componente() {
    }

    public Componente(double v) {
        super(v);
        TextField textField = new TextField();
        ImageView imageView1 = new ImageView();
        ImageView imageView2 = new ImageView();
        ImageView imageView3 = new ImageView();
        this.getChildren().addAll(textField, imageView1, imageView2, imageView3);
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
