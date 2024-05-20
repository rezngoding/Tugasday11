package com.example.tugasday11;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnbelanja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnbelanja = findViewById(R.id.btnBelanja);

        Klik();
    }

    void Klik(){
        btnbelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentHal2);
            }
        });
    }
}