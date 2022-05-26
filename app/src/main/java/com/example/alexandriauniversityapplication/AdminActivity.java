package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        final Button newStudentBtn = (Button) findViewById(R.id.newStudentBtn);
        final Button modifyStudentBtn = (Button) findViewById(R.id.modifyStudentBtn);

        newStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newStudentI = new Intent(getApplicationContext(),NewStudent.class);
                startActivity(newStudentI);
            }
        });

        modifyStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modifyStudentI = new Intent(getApplicationContext(),ModifyStudent.class);
                startActivity(modifyStudentI);
            }
        });
    }
}