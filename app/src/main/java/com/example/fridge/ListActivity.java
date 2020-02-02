package com.example.fridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    static Fridge f1 = new Fridge();
    Button rec;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        set();
    }

    public void setContentsOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textview = (TextView) view;
        textview.setText(newContents);
        rec = (Button) findViewById(R.id.gr);
    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add: {
                Intent intent = new Intent(this, IngredientActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.gr:{
                Intent intent = new Intent(this, RecListActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.sub:{
                Intent intent = new Intent(this, DeleteInActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

    public void set(){
            setContentsOfTextView(R.id.textView3, MainActivity.f1.listInventory());

    }


}
