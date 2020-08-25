package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText name = (EditText) findViewById(R.id.edit_textdata);
        Button button = (Button) findViewById((R.id.button_submitintent));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this,MainActivity2.class);
                i.putExtra( "name", name.getText().toString());
                startActivity(i);
            }
        });
    }
}
