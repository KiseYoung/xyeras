package com.example.xyeras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn_start);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent swither = new Intent(MainActivity.this,Vtoraya.class);
                MainActivity.this.startActivity(swither);
            }
        });
        ImageView image_1 = findViewById(R.id.image);
        image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent swither = new Intent (MainActivity.this,Vtoraya.class);
                MainActivity.this.startActivity(swither);
            }
        });

    }
}