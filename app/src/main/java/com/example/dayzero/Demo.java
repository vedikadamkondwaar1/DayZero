package com.example.dayzero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Demo extends AppCompatActivity {
    Button buttonThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        buttonThird=findViewById(R.id.button3);
        buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Demo.this,MainActivity.class);
                startActivity(intent);
                //Intent intent1=new Intent(Welcome.this,MainActivity.class);
              //  startActivity(intent1);
            }
        });
    }
}
