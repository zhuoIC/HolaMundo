package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Mi primera aplicación Android
 * @author Nicolás Hernández Jiménez
 * @version 1.0
 * @see android.app.Activity
 */

public class HolaMundoMainActivity extends AppCompatActivity {
    // 0. Creamos un objeto TextView al que le daremos memoria más adelante
    private TextView txvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo_main);
        // 1. Obtenemos el id del TextView para manejarlo. Hay que hacer un casting porque devuelve View (padre)
        txvMessage = (TextView) findViewById(R.id.txvMessage);
        // 2. Cambiamos el texto del TextView por el registrado en strings.xml. Obtenemos el recurso de la clase R
        txvMessage.setText(R.string.s_message);
    }
}
