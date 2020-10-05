package com.ieee.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

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
        //actionbar title
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("First Activity");

        //edit text
        final EditText mNameEt =findViewById(R.id.nameEt);
        final EditText mEmailEt =findViewById(R.id.EmailEt);

        //Button
        Button msaveBtn =findViewById(R.id.saveBtn);
        msaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data from edit text
                String name =mNameEt.getText().toString();
                String email =mEmailEt.getText().toString();


                //activity intent
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("EMAIL",email);
                startActivity(intent);

            }
        });

    }
}