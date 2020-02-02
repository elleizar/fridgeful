package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class IngredientActivity extends AppCompatActivity {

    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);
    }

    public void onClick(View v) {
        String name = getInputOfTextField(R.id.name);
        String textexp = getInputOfTextField(R.id.exp);

        double exp = Double.parseDouble(textexp);

        String foodGroup = getItemSelected(R.id.food);

        try {
            MainActivity.f1.addIngredient(name, foodGroup, (int)exp);
        }
        catch (Exception e){
            System.out.println(e);
        }

        switch (v.getId()) {
            case R.id.done: {
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.back: {
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
