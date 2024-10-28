package com.example.pizzeria_con_login.negocio;

import com.example.pizzeria_con_login.modelo.entidad.Ingrediente;
import com.example.pizzeria_con_login.modelo.entidad.Pizza;
import com.example.pizzeria_con_login.persistencia.DaoUsuario;

import java.util.ArrayList;

public class GestorPizza {

    //calcular el precio de la pizza
    //dependiendo de su tamaño y con el size del array de ingredientes por 2
    //obtienes el precio
    //tienes que ver que los checkbocks que esten checked pues añadirlos
    //al arraylist de ingredientes o, como última opción cada
    //checkbox is checked pues un  contador++ y luego multiplicarlo por el precio


    //ver como asignarle la pizza al uusario
    //deberia hacer un toString() de la clase Pizza

    DaoUsuario daoUsuario = new DaoUsuario();


    public int calcularPrecioPizza(Pizza pizza){

        return  pizza.getIngredientes().size()*2;

    }

    /***
     * Método para añadir un ingrediente al arrayList y asi calcular el precio
     * final de la pizza en la capa de negocio
     * @param ingrediente
     */
    public void addIngrediente(Ingrediente ingrediente, Pizza pizza){
        pizza.getIngredientes().add(ingrediente);
    }

    public ArrayList<Ingrediente> getIngredientes(Pizza pizza){
        return pizza.getIngredientes();
    }
}