package com.example.jorge.lab_2;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button back = (Button) findViewById(R.id.buttonBackground);
        Button inicio = (Button) findViewById(R.id.button3);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicio = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(inicio);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.back2);
                layout.setBackgroundColor(Color.BLUE);

            }
        });



    }
}
