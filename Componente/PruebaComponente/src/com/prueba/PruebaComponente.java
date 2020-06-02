package com.prueba;

import com.alberto.componente.Componente;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PruebaComponente extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Componente componente = new Componente();
        Scene scene = new Scene(componente);
        stage.setScene(scene);
        stage.show();
        componente.mostrarProducto();
    }

    public static void main(String[] args){
        launch(args);
    }
}
