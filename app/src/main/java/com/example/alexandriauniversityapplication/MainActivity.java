package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //rendering xml UI
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // b5ly el view ely hy3rdo el activity_main xml
        setContentView(R.layout.activity_main);

        // b3rf el buttons
        final Button adminBtn = (Button) findViewById(R.id.adminBtn);
        final Button studentBtn = (Button) findViewById(R.id.studentBtn);

        // function tn2lny 3ala class adminactivity
        adminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ystd3y class tany
                Intent adminI = new Intent(getApplicationContext(),AdminActivity.class);
                startActivity(adminI);
            }
        });

        studentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent studentI = new Intent(getApplicationContext(),StudentActivity.class);
                startActivity(studentI);
            }
        });
    }
}