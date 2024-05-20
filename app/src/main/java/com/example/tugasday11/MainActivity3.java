package com.example.tugasday11;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    ImageButton btnakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnakun = findViewById(R.id.btnakun);

        Klik();
    }

    void Klik(){
        btnakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal2 = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intentHal2);
            }
        });
    }
}