package com.example.jorge.lab_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button español = (Button) findViewById(R.id.buttonespañol);
        Button ingles = (Button) findViewById(R.id.buttoningles);
        Button pagina1 = (Button) findViewById(R.id.button1);
        Button pagina2 = (Button) findViewById(R.id.button2);

        pagina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(pagina1);
            }
        });

        pagina2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(pagina2);
            }
        });


        español.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView españolTxt = (TextView) findViewById(R.id.textView);
                españolTxt.setText("Hola Mundo");
            }
        });

        ingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView inglesTxt = (TextView) findViewById(R.id.textView);
                inglesTxt.setText("Hello World");
            }
        });
    }


}

