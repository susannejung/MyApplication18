package com.example.myapplication18;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et=findViewById(R.id.toId);
        EditText et1=findViewById(R.id.subjectId);
        EditText et2=findViewById(R.id.messageId);
        Button b=findViewById(R.id.sendId);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, MainActivity2.class);
                switchActivityIntent.putExtra("message", "From: " + et2.getText());
                startActivity(switchActivityIntent);
            }
        });


    }
}