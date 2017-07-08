package com.efficare.vishw.efficare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button doc,pat,phy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doc = (Button)findViewById(R.id.doc);
        pat = (Button)findViewById(R.id.pat);
        phy = (Button)findViewById(R.id.phy);

        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,doctor.class);
                startActivity(i1);
            }
        });

        pat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,patient.class);
                startActivity(i2);

            }
        });

        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent i3 =new Intent(MainActivity.this,pharmacy.class);
                startActivity(i3);
            }
        });

    }
}
