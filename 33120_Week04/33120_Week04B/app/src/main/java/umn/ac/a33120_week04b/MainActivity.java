package umn.ac.a33120_week04b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    private EditText editText;
    private Button halSatu, halDua;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        halSatu = findViewById(R.id.main_button_change_1);
        halDua = findViewById(R.id.main_button_change_2);

        halSatu.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        halDua.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });
    }
}