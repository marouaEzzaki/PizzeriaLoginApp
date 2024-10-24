package com.example.pizzeria_con_login.modelo.entidad;

//Los usuarios tendrán un nombre, un password, una dirección y una pizza asocidada.
public class Usuario {

    String nombre;
    String password;
    String direccion;
    Pizza pizza;


    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setPassword(String password){
        this.password = password;
    }

    void setDireccion(String direccion){
        this.direccion = direccion;
    }

    

}
