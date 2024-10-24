package com.example.pizzeria_con_login.negocio;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;
import com.example.pizzeria_con_login.persistencia.DaoUsuario;

public class GestorUsuario {
    final DaoUsuario daoUsuario = new DaoUsuario();




    /***
     * Valida si el usuario que intenta iniciar sesion es valido
     * @param usuario El usuario a  validar
     * @return Devuelve true si se puede iniciar sesion y false en caso contrario
     */
     public boolean validarUsuario(Usuario usuario){
        boolean login = false;
        for(Usuario user : daoUsuario.getUsuariosRegistrados()){
            if (user.getNombre().equalsIgnoreCase(usuario.getNombre())
                && user.getPassword().equalsIgnoreCase(usuario.getPassword())){
                login = true;
            }
        }
        return login;
    }
}