package com.example.pizzeria_con_login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;
import com.example.pizzeria_con_login.negocio.GestorUsuario;
import com.example.pizzeria_con_login.persistencia.DaoUsuario;

public class LogInAcivity extends AppCompatActivity {

    public final static String K_USUARIO = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        GestorUsuario gu = new GestorUsuario();
        DaoUsuario dao = new DaoUsuario();

        EditText editTextUserName = findViewById(R.id.editTxtUser);
        EditText editTextPassword = findViewById(R.id.editTxtPassword);
        Button botonLogin = findViewById(R.id.btnLogIn);

        botonLogin.setOnClickListener(v -> {
            String userName = editTextUserName.getText().toString();
            String userPassword = editTextPassword.getText().toString();

            Usuario usuarioFromTheApp = new Usuario();
            usuarioFromTheApp.setNombre(userName);
            usuarioFromTheApp.setPassword(userPassword);

            boolean esValidado = gu.validarUsuario(usuarioFromTheApp);

            if (esValidado){
                Log.i("LogInActivity", "Se ha validado correctamente el login del usuarioFromTheApp: ");

                Intent intent = new Intent(LogInAcivity.this,PedirPizzaActivity.class);

                Usuario userValidated = dao.getUserByName(userName);

                if (userValidated!=null){
                    intent.putExtra(K_USUARIO,userValidated);
                    startActivity(intent);
                }

            }else{
                Log.i("LogInActivity", "no se ha validado ");

                //LLAMAR OTRA ACTIVITY QUE MUESTRA EL MENSAJE DE ERROR Y PERMITE
                //AL USUARIO VOLVER A INTRODUCIR LOS DATOS

                Intent intent = new Intent(LogInAcivity.this, LogInDatosIncorrectosActivity.class);
                startActivity(intent);

                //EN VEZ DE LLAMAR A OTRA ACTIVITY , MUETSRAS MENSAJES DE ERROR :

                /*
                TextView textViewUserMsgIncorrecto = findViewById(R.id.userPswdIncorrecto);
                textViewUserMsgIncorrecto.setText("USUARIO O PASSWORD INCORRECTOS");

                TextView textViewIntenteloDeNuevo = findViewById(R.id.IntenteloDeNuevoMsg);
                textViewIntenteloDeNuevo.setText("Por favor, inténtelo de nuevo");

                 */

            }
        });
    }
}