package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class IngredientActivity extends AppCompatActivity {

    EditText name;
    EditText exp;
    Spinner food;
    Fridge fridge = new Fridge();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);
        name = (EditText) findViewById(R.id.name);
        exp = (EditText) findViewById(R.id.exp);
        food = (Spinner) findViewById(R.id.food);
//        fridge = new Fridge();
//        MainActivity.f1.addIngredient(name.toString(), food.toString(), Integer.parseInt(exp.toString()));
          MainActivity.f1.addIngredient(name.toString(), "B", 3);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.done: {
                Intent intent = new Intent(this, ListActivity.class);
//                intent.putExtra("name", name.toString());
                startActivity(intent);
            }
        }
    }
}
