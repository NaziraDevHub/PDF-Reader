package com.nazira.pdfreader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.assetName = "bricklane_pdf.pdf";

                Intent myIntent = new Intent(Dashboard.this,MainActivity.class);
                startActivity(myIntent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.assetName = "ezrapound_file.pdf";

                Intent myIntent = new Intent(Dashboard.this,MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
}