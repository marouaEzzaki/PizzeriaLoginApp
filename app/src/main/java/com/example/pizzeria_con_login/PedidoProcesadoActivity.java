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

        TextView textView = findViewById(R.id.pedidoProcesado);

        Pizza pizza = (Pizza) getIntent().getSerializableExtra(PedirPizzaActivity.K_PIZZA);


        String tamanioPizza = pizza.getTamanioPizza().toString();

        textView.setText("Una pizza " + tamanioPizza + " más los " + pizza.getIngredientes().size() + " ingredientes" +
                " el total a pagar es de : " + pizza.getPrecio() + " €");
    }
}