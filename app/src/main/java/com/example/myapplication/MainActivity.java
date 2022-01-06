package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstInputText;

    Button firstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInputText = findViewById(R.id.first_input_text);
        firstButton = findViewById(R.id.first_button);



        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Input = firstInputText.getText().toString();
                Intent x = new Intent(getBaseContext(), SecondActivity.class);
                x.putExtra("name1",Input);
                startActivity(x);
            }
        });


    }
}