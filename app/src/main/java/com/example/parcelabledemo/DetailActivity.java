package com.example.parcelabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView G_Name,G_Age,G_RollNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        G_Age = findViewById(R.id.D_Age);
        G_Name = findViewById(R.id.D_Name);
        G_RollNo = findViewById(R.id.D_Roll);

        //collect our intent
        Intent intent = getIntent();
        Item item = intent.getParcelableExtra("Deta");

        //now collect all item values

        Integer age = item.getAge();

        String name = item.getName();

        Integer rollno = item.getRollno();

        G_Name.setText(name);
        G_RollNo.setText(String.valueOf(rollno));
        G_Age.setText(String.valueOf(age));

    }
}