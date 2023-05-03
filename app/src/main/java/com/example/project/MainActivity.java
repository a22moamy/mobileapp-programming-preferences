package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    TextView prefTextRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onResume(){
        super.onResume();
        sharedPreferences = getSharedPreferences("preferences", MODE_PRIVATE);
        prefTextRef = findViewById(R.id.preftextview);

        prefTextRef.setText(sharedPreferences.getString("MyAppPreferenceString", "No preference found."));

    }

}
