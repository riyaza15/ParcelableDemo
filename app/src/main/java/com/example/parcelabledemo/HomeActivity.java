package com.example.parcelabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    Item item;

    EditText name,length,id;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name = findViewById(R.id.Ed_Name);
        length = findViewById(R.id.Ed_Age);
        id = findViewById(R.id.Ed_RollNo);
        button = findViewById(R.id.E_btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Parsing String To Integer

                int x = Integer.parseInt(length.getText().toString());
                int y = Integer.parseInt(id.getText().toString());

                item = new Item(x,name.getText().toString(),y);

                Intent intent = new Intent(HomeActivity.this, DetailActivity.class);
                intent.putExtra("Deta", item);
                startActivity(intent);
            }
        });

    }
}

