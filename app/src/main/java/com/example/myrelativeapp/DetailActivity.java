package com.example.myrelativeapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {
    static final String TAG = DetailActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }

}
