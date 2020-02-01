    package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

    public Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_button = (Button) findViewById(R.id.gs);
        start_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }
    private void goToSecondActivity(){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}
