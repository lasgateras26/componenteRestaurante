package com.alberto.componente;

import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.Timer;
import java.util.TimerTask;

public class Componente extends VBox {

    private IntegerProperty segundos = new SimpleIntegerProperty(0);

    private int contador = 0;
    private TextField textField;
    private ImageView imageView;

    private Producto producto;

    public Componente() {
        textField = new TextField();
        imageView = new ImageView();
        this.getChildren().addAll(textField, imageView);
        producto = new Producto();
        textField.setText(producto.getNombre());
    }

    public Componente(double v) {
        super(v);
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

    public void mostrarProducto(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        while(contador < producto.getListaImagenes().size()){
                            imageView.setImage(producto.getListaImagenes().get(contador));
                            contador++;
                        }
                    }
                });
            }
        }, 1000, segundos.get());
    }
}
