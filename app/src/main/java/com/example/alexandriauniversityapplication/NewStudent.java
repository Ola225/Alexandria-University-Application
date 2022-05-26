package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_student);
        final Button basicInfoBtn = (Button) findViewById(R.id.basicInfoBtn);
        final Button coursesBtn = (Button)findViewById(R.id.coursesBtn);

        basicInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adminI = new Intent(getApplicationContext(), BasicInfoActivity.class);
                startActivity(adminI);
            }
        });

        coursesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coursesI = new Intent(getApplicationContext(),CoursesActivity.class);
                startActivity(coursesI);
            }
        });
    }
}