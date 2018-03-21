package com.example.maje.miercoles21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class B_Activity extends AppCompatActivity implements View.OnClickListener{

    private EditText nombre;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_);
        init();
        boton.setOnClickListener(this);

    }

    private void init(){
        nombre = (EditText) findViewById(R.id.nombre);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("nombre",nombre.toString());
    }
}
