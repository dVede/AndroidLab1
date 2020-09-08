package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        int id = view.getId();
        switch (id){
            case R.id.button1:
                Intent intent1 = new Intent(this, Lab1.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, Lab2.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, Lab6.class);
                startActivity(intent3);
                break;
            case R.id.button16:
                Intent intent4 = new Intent(this, Lab3.class);
                startActivity(intent4);
                break;
            case R.id.button17:
                Intent intent5 = new Intent(this, Lab4.class);
                startActivity(intent5);
                break;
            case R.id.button18:
                Intent intent6 = new Intent(this, Lab5.class);
                startActivity(intent6);
                break;
        }
    }
}
