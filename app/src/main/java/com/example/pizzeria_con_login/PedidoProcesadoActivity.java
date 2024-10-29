package com.example.pizzeria_con_login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pizzeria_con_login.modelo.entidad.Pizza;

public class PedidoProcesadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pedido_procesado);

        TextView textViewTamanio = findViewById(R.id.pedidoProcesado);

        TextView textViewNumIngredientes = findViewById(R.id.numIngredientes);

        TextView textViewTotalPagar  = findViewById(R.id.precioTotalPagar);

        Pizza pizza = (Pizza) getIntent().getSerializableExtra(PedirPizzaActivity.K_PIZZA);

        String tamanioPizza = pizza.getTamanioPizza().toString();
        
        textViewTamanio.setText(tamanioPizza);
        textViewNumIngredientes.setText( " "+pizza.getIngredientes().size());
        textViewTotalPagar.setText(pizza.getPrecio() + " €");


    }
}