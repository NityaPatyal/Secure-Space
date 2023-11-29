package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class LawsActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(LawsActivity.this,MainActivity.class));
        LawsActivity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);
        RecyclerView recyclerView = findViewById(R.id.recycleLaws);
        String[] laws = new String[]{"The Prohibition of Child Marriage Act, 2006","Special Marriage Act, 1954","Dowry Prohibition Act, 1961","Indian Divorce Act, 1969","Maternity Benefit Act,1861","Medical Termination of Pregnancy Act,1971","Sexual Harassment of Women at Workplace (Prevention, Prohibition and Redress) Act, 2013","Medical Support for Senior Citizen,Section 20","Establishment of Old Age Homes,Section 19","Maintenance of Parents and Senior Citizen,Section 5"};

        MyAdapter adapter = new MyAdapter(this, laws, position -> {
            Intent intent = new Intent(LawsActivity.this,LawDisplayerActivity.class);
            intent.putExtra("position",position);
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(LawsActivity.this,MainActivity.class));
            LawsActivity.this.finish();
        });
    }
}