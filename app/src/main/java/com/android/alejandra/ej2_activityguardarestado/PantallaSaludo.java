package com.android.alejandra.ej2_activityguardarestado;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PantallaSaludo extends AppCompatActivity {
    private TextView textoSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_saludo);

        //obtengo referencias
        textoSaludo=(TextView)findViewById(R.id.tvSaludo);

        //recoger el nombre del intent
        String nombre=getIntent().getStringExtra("NOMBRE");
        if(!nombre.isEmpty())
            textoSaludo.setText("Hola "+nombre+"!!!!!");
    }
}
