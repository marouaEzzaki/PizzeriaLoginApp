package com.example.pizzeria_con_login.persistencia;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;

public class DaoUsuario {

    Usuario user1 = new Usuario();
    Usuario user2 = new Usuario();
    Usuario user3 = new Usuario();
    Usuario usuariosRegistrados[];

    public DaoUsuario(){
        user1.setNombre("Maroua");
        user1.setDireccion("Calle 1");
        user1.setPassword("1234");

        user2.setNombre("Nadia");
        user2.setDireccion("Calle 2");
        user2.setPassword("nadiaguapa");


        user3.setNombre("usuario");
        user3.setDireccion("Calle 3 ");
        user3.setPassword("4321");

        usuariosRegistrados = new Usuario[3];
        usuariosRegistrados[0] = user1;
        usuariosRegistrados[1] = user2;
        usuariosRegistrados[2] = user3;

    }

    public Usuario[] getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
}