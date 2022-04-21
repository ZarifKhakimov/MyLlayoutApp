package com.example.myrelativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initViews();
    }

    void initViews(){
        Button b_none = findViewById(R.id.b_done);
        b_none.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });
    }

    void openNextPage(){
        Intent intent = new Intent(this,DetailActivity.class);
        startActivity(intent);
    }
}