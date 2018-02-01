package com.example.jorge.lab_2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button change = (Button) findViewById(R.id.buttonchange);
        Button inicio = (Button) findViewById(R.id.button4);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicio = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(inicio);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView changetxt = (TextView) findViewById(R.id.textView2);
                changetxt.setTextColor(Color.BLUE);
            }
        });
    }
}
