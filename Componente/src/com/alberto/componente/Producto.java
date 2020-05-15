package com.alberto.componente;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Producto {

    private String nombre;
    private ArrayList<Image> listaImagenes;

    Image imagen1 = new Image("img/cachopo1.jpg");
    Image imagen2 = new Image("img/cachopo2.jpg");
    Image imagen3 = new Image("img/cachopo3.jpg");

    public Producto(){
        this.nombre = "Cachopo";
        listaImagenes = new ArrayList<Image>();
        listaImagenes.add(imagen1);
        listaImagenes.add(imagen2);
        listaImagenes.add(imagen3);
    }

    public Producto(String nombre, ArrayList<String> listaImagenes){
        this.nombre = nombre;
        listaImagenes = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Image> getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(ArrayList<Image> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
}
