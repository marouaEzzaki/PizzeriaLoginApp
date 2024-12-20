package com.example.pizzeria_con_login.persistencia;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;

public class DaoUsuario {

    Usuario user1 = new Usuario();
    Usuario user2 = new Usuario();
    Usuario user3 = new Usuario();
    Usuario usuariosRegistrados[];

    public DaoUsuario(){
        user1.setNombre("Maroua");
        user1.setDireccion("123 Elm Street, New York, US, Penthouse");
        user1.setPassword("1234");

        user2.setNombre("Nadia");
        user2.setDireccion("456 Maple Avenue, Toronto, Canadá, Luxury Mansion in Yorkville");
        user2.setPassword("nadia123");


        user3.setNombre("usuario");
        user3.setDireccion("789 Oak Lane, Madrid 28001, España");
        user3.setPassword("4321");

        usuariosRegistrados = new Usuario[3];
        usuariosRegistrados[0] = user1;
        usuariosRegistrados[1] = user2;
        usuariosRegistrados[2] = user3;

    }

    /***
     * Este método se encarga de buscar un usuario por su nombre
     * @param name el nombre a buscar en nuestra estructura de datos
     * @return si encuentra hay una coincidencia devuelve el usuario, en caso contrario, null
     */
    public Usuario getUserByName(String name){
        for(Usuario user : usuariosRegistrados){
            if (user.getNombre().equalsIgnoreCase(name)){
                return user;
            }
        }

        return null;
    }


    /***
     * Devuelve todos los usuarios registrados en nuestra aplicacion.
     * @return una lista que contiene todos los usuarios registrados
     */
    public Usuario[] getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
}