package com.example.fastaccess.classrutine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button monButton, tuesButoon, wedButoon, thusButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monButton = findViewById(R.id.Buttonmonday);
        tuesButoon = findViewById(R.id.Buttontuesday);
        wedButoon = findViewById(R.id.Buttonwednesday);
        thusButton = findViewById(R.id.Buttonthursday);

        monButton.setOnClickListener(this);
        tuesButoon.setOnClickListener(this);
        wedButoon.setOnClickListener(this);
        thusButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.Buttonmonday) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "monday");
            startActivity(intent);
        }

        if (v.getId() == R.id.Buttontuesday) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "tuesday");
            startActivity(intent);
        }

        if (v.getId() == R.id.Buttonwednesday) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "wednesday");
            startActivity(intent);
        }

        if (v.getId() == R.id.Buttonthursday) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "thursday");
            startActivity(intent);
        }
    }
}

