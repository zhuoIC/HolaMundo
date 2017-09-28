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
    private TextView txvMessage;
    @Override
    // Muestra el dibujo de
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo_main);
        txvMessage = (TextView) findViewById(R.id.txvMessage);
        txvMessage.setText(R.string.message);
    }
}
