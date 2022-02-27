package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input =(EditText)findViewById(R.id.inputId);
        EditText output =(EditText)findViewById(R.id.outputId);
        Button calc =(Button)findViewById(R.id.calculateId);
        Button newInput =(Button)findViewById(R.id.newId);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double far = 5d/9d;
                String x =input.getText().toString();
                double re=1;
                try {

                    double y = Double.parseDouble(x.trim());
                    re = (y-32)*(far);
                    re = Math.floor(re);

                }catch (Exception e){
                    System.out.println("Error");
                }
                output.setText(String.valueOf(re));

                input.setCursorVisible(true);
            }
        });

        newInput.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(view==newInput){
                    startActivity(new Intent(MainActivity.this , MainActivity.class));
                }
            }
        });

    }

}