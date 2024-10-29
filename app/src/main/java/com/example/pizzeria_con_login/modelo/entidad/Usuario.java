package com.example.pizzeria_con_login.modelo.entidad;

import java.io.Serializable;

public class Usuario implements Serializable {

    String nombre;
    String password;
    String direccion;
    Pizza pizza;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getDireccion() {
        return direccion;
    }
}