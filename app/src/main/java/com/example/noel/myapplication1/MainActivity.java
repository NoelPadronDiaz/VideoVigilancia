package com.example.noel.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.noel.streamingbien.Streaming;

public class MainActivity extends AppCompatActivity {

    Button stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stream = (Button)findViewById(R.id.button);

        stream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stream = new Intent(MainActivity.this,Streaming.class);
                startActivity(stream);
            }
        });

    }
}
