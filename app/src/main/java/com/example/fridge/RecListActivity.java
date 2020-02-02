package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_list);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rec1: {
                Intent intent = new Intent(this, RecipeActivity.class);
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
