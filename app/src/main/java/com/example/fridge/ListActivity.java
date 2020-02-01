package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Fridge fridge = new Fridge();
    ListView listView;
//    ArrayList<Ingredients> arrayList;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    IngredientActivity ingredientActivity = new IngredientActivity();

    TextView str;
    String ing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        str = (TextView) findViewById(R.id.listView);
        str.append("Bob");

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add: {
                Intent intent = new Intent(this, IngredientActivity.class);
                startActivity(intent);
            }
        }
//        str.append(getIntent().getExtras().getString("name"));

    }


}
