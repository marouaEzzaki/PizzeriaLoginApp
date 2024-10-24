package com.example.pizzeria_con_login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;
import com.example.pizzeria_con_login.negocio.GestorUsuario;

public class LogInAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        GestorUsuario gu = new GestorUsuario();

        EditText editTextUserName = findViewById(R.id.editTxtUser);
        EditText editTextPassword = findViewById(R.id.editTxtPassword);
        Button botonLogin = findViewById(R.id.btnLogIn);




        botonLogin.setOnClickListener(v -> {
            String userName = editTextUserName.getText().toString();
            String userPassword = editTextPassword.getText().toString();

            Usuario usuario = new Usuario();
            usuario.setNombre(userName);
            usuario.setPassword(userPassword);

            boolean esValidado = gu.validarUsuario(usuario);

            if (esValidado){
                Log.i("LogInActivity", "Se ha validado correctamente el login del usuario: ");

                Intent intent = new Intent(LogInAcivity.this,PedirPizzaActivity.class);
                startActivity(intent);
            }else{
                Log.i("LogInActivity", "no se ha validado ");

            }

        });
    }
}