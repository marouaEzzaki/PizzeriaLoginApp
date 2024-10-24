package com.example.pizzeria_con_login.modelo.entidad;

//Los usuarios tendrán un nombre, un password, una dirección y una pizza asocidada.
public class Usuario {

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
}