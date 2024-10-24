package com.example.pizzeria_con_login.persistencia;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;

public class DaoUsuario {

    Usuario user1 = new Usuario();
    Usuario user2 = new Usuario();
    Usuario user3 = new Usuario();



    Usuario usuariosRegistrados[] = {user1, user2, user3};

   // private usuariosGuardados


    public Usuario[] getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
}
