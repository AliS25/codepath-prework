package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            int counter=0;
            @Override
            public void onClick(View view) {
                if (counter%2==0)
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
                else          ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.green));
                counter++;
            }
        });
    }
}