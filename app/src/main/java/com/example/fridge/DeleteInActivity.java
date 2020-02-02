package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class DeleteInActivity extends AppCompatActivity {

    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_in);
    }

    public void onClick(View v) {
        String name = getInputOfTextField(R.id.name);

        try {
            MainActivity.f1.removeIngredient(name);
        }
        catch (Exception e){
            System.out.println(e);
        }

        switch (v.getId()) {
            case R.id.done: {
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent);
            }
        }
    }
}
