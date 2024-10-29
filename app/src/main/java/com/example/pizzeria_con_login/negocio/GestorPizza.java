package com.example.pizzeria_con_login.negocio;

import com.example.pizzeria_con_login.modelo.entidad.Ingrediente;
import com.example.pizzeria_con_login.modelo.entidad.Pizza;
import com.example.pizzeria_con_login.persistencia.DaoUsuario;

public class GestorPizza {

    DaoUsuario daoUsuario = new DaoUsuario();

    /***
     * Este método calcula parte del precio de la pizza añadiendo
     * en funcion de los ingredientes que el usuario haya elegido
     * @param pizza Pizza la cual vamos a calcular su precio
     * @return devuelve el precio de los ingredientes seleccionados
     */
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
}