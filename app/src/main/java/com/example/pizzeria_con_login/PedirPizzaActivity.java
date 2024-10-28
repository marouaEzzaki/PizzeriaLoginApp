package com.example.pizzeria_con_login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzeria_con_login.modelo.entidad.Ingrediente;
import com.example.pizzeria_con_login.modelo.entidad.Pizza;
import com.example.pizzeria_con_login.modelo.entidad.PizzaSize;
import com.example.pizzeria_con_login.modelo.entidad.Usuario;
import com.example.pizzeria_con_login.negocio.GestorPizza;

public class PedirPizzaActivity extends AppCompatActivity {

    Pizza pizza;
    public final static String K_PIZZA = "pizza";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_pizza);

        GestorPizza gp = new GestorPizza();

        Usuario usuario = (Usuario)getIntent().getSerializableExtra(LogInAcivity.K_USUARIO);

        TextView bienvenidaUsername = findViewById(R.id.bienvenidaUsernmae);
        TextView userDatosEnvio = findViewById(R.id.userDatosEnvio);

        if (usuario!= null){
            bienvenidaUsername.setText(usuario.getNombre() + "!");
            userDatosEnvio.setText(usuario.getDireccion() + ".");
        }

        RadioGroup radioGroup = findViewById(R.id.Grupo1);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {

            if(checkedId == R.id.small){
                pizza = new Pizza(PizzaSize.PEQUENA);
            } else if (checkedId == R.id.medium) {
                pizza = new Pizza(PizzaSize.MEDIANA);

            } else if (checkedId == R.id.big) {
                pizza = new Pizza(PizzaSize.GRANDE);
            }

        });

        final CheckBox atun = findViewById(R.id.atun);
        final CheckBox champinion = findViewById(R.id.champinion);
        final CheckBox pollo = findViewById(R.id.pollo);
        final CheckBox salmon = findViewById(R.id.salmon);
        final CheckBox pavo = findViewById(R.id.pavo);
        final CheckBox quesoExtra = findViewById(R.id.quesoExtra);
        final CheckBox aceitunas = findViewById(R.id.aceitunas);
        final CheckBox cebolla = findViewById(R.id.cebolla);

        CheckBox[] checkBoxes = {atun, champinion, pollo, salmon, pavo, quesoExtra, aceitunas, cebolla};

        Button btnComprar = findViewById(R.id.btnComprar);

        btnComprar.setOnClickListener(v -> {
            for (CheckBox cb : checkBoxes) {
                if (cb.isChecked()) {
                    Ingrediente ingrediente = new Ingrediente();
                    gp.addIngrediente(ingrediente, pizza);
                }
            }

            pizza.setPrecio(pizza.getPrecio() + gp.calcularPrecioPizza(pizza));

            Intent intent = new Intent(PedirPizzaActivity.this, PedidoProcesadoActivity.class );
            intent.putExtra(K_PIZZA, pizza);
            startActivity(intent);

        });
    }
}