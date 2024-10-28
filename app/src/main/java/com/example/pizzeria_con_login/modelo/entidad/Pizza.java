package com.example.pizzeria_con_login.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;

public class Pizza implements Serializable {

    PizzaSize tamanioPizza;
    ArrayList<Ingrediente> ingredientes;
    int precio;

    public Pizza(PizzaSize tamanioPizza){
        this.tamanioPizza = tamanioPizza;
        this.ingredientes = new ArrayList<>();
        this.precio = calcularPrecio();

    }

    private int calcularPrecio() {
        switch (tamanioPizza) {
            case GRANDE: return 15;
            case MEDIANA: return 10;
            case PEQUENA: return 5;
            default: return 0;
        }
    }


    public PizzaSize getTamanioPizza() {
        return tamanioPizza;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTamanioPizza(PizzaSize tamanioPizza) {
        this.tamanioPizza = tamanioPizza;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}