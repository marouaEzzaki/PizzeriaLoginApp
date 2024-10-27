package com.example.pizzeria_con_login.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;

public class Pizza implements Serializable {

    PizzaSize tamanioPizza;
    ArrayList<Ingrediente> ingredientes;
    int precio;

    public Pizza(){
        ingredientes = new ArrayList<>();
    }
    void setPrecio(){
        switch (tamanioPizza){
            case GRANDE: precio = 15;
            case MEDIANO: precio = 10;
            case PEQUENO: precio = 5;
        }
    }

    /***
     * Método para añadir un ingrediente al arrayList y asi calcular el precio
     * final de la pizza en la capa de negocio
     * @param ingrediente
     */
    void addIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }
}