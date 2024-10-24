package com.example.pizzeria_con_login.negocio;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;
import com.example.pizzeria_con_login.persistencia.DaoUsuario;

public class GestorUsuario {

    final DaoUsuario daoUsuario = new DaoUsuario();



     boolean validarUsuario(Usuario usuario){
        boolean login = false;
        for(Usuario user : daoUsuario.getUsuariosRegistrados()){
            if (user.equals(usuario)){
                login = true;
            }
        }
        return login;
    }



}
