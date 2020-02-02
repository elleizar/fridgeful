package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back: {
                Intent intent = new Intent(this, RecListActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
