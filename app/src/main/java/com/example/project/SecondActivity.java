package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    private SharedPreferences sharedPreferences;

    private SharedPreferences.Editor myPreferenceEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText newPrefText = findViewById(R.id.prefEditText);
                sharedPreferences = getSharedPreferences("preferences", MODE_PRIVATE);
                myPreferenceEditor = sharedPreferences.edit();
                myPreferenceEditor.putString("MyAppPreferenceString", newPrefText.getText().toString());
                myPreferenceEditor.apply();
            }
        });

    }
}