package com.example.pizzeria_con_login.modelo.entidad;

import java.util.ArrayList;

public class Pizza {

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
}
