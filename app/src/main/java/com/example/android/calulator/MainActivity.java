package com.example.android.calulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //final EditText editText1=(EditText)findViewById(R.id.editText1);
        Button btnAdd=(Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Number One = Double.parseDouble(Number One.getText().toString());
                Number Two = Double.parseDouble(Number Two.getText().toString()); ;
                btnAdd = Number One + Number Two;
                btnAdd.setText(Double.toString(btnAdd));
            }
        });

        @Override
            public void onClick(View arg0){

                Intent intent=new Intent(MainActivity.this,Calculator2.class);
                startActivity(intent);
            }
        };
    };

