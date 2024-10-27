package com.example.pizzeria_con_login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pizzeria_con_login.modelo.entidad.Usuario;

import org.w3c.dom.Text;

public class PedirPizzaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_pizza);

        Usuario usuario = (Usuario)getIntent().getSerializableExtra(LogInAcivity.K_USUARIO);

        TextView bienvenidaUsername = findViewById(R.id.bienvenidaUsernmae);
        TextView userDatosEnvio = findViewById(R.id.userDatosEnvio);

        if (usuario!= null){
            bienvenidaUsername.setText(usuario.getNombre() + "!");
            userDatosEnvio.setText(usuario.getDireccion() + ".");
        }


        //recoger todos los cooso
        //calcular el precio
        //para hacer la vista de resumen de su pedido
    }
}