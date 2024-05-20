package com.example.tugasday11;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    ImageButton btnkeranjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnkeranjang = findViewById(R.id.btnkeranjang);

        Klik();
    }

    void Klik(){
        btnkeranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHal2 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intentHal2);
            }
        });
    }
}