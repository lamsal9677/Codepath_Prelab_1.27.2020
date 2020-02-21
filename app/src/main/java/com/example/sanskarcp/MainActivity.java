package com.example.sanskarcp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText T2;//defining the second edit text
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       T2 = findViewById(R.id.T2);

        Button B2 = findViewById(R.id.B2);
        Button B3 = findViewById(R.id.B3);
        Button Res = findViewById(R.id.Res);
        Button B4 = findViewById(R.id.B4);

        TextView T1 = findViewById(R.id.T1);
        T1.setText("Hello from Sanskar!");
        T1.setTextColor(0xFFFFFFFF);

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//Second button to display the change in color
                TextView T1 = findViewById(R.id.T1);
                T1.setTextColor(0xFF00FF00);
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//third button to change to predefined text
                TextView T1 = findViewById(R.id.T1);
                T1.setText("Android is Awesome!");
            }
        });

        Res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//fourth button to reset the content
                TextView T1 = findViewById(R.id.T1);
                T1.setText("Hello from Sanskar!");
                T1.setTextColor(0xFFFFFFFF);

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {//fifth button to change the text
            @Override
            public void onClick(View v) {//this is to get the user's input and then change it
                String I;
                I = T2.getText().toString();
                TextView T1 = findViewById(R.id.T1);
                T1.setText(I);

                int a= T2.length();
                if (a<=0){
                    T1.setText("Hello from Sanskar!");
                }
                }
        });
}}
