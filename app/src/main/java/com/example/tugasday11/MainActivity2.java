package com.example.tugasday11;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    ImageButton btnfeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnfeed = findViewById(R.id.btnfeed);

        Klik();
    }

    void Klik(){
        btnfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal2 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intentHal2);
            }
        });
    }
}