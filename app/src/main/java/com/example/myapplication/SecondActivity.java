package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView secondActivityResult;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondActivityResult = findViewById(R.id.second_activity_result);


        Intent intent = getIntent();
        String text = intent.getStringExtra("name1");

        secondActivityResult.setText(text);

    }
}
