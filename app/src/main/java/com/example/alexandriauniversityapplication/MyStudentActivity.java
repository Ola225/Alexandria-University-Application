package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MyStudentActivity extends AppCompatActivity {

    Button myInfo,myCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_student);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String regNum = extras.getString("key");

            myInfo = (Button) findViewById(R.id.myBasicInfoBtn);
            myCourses = (Button) findViewById(R.id.myCoursesInfoBtn);

            myInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent studentInfoI = new Intent(MyStudentActivity.this, StudentInfoActivity.class);
                    studentInfoI.putExtra("key",regNum);
                    startActivity(studentInfoI);
                }
            });

            myCourses.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent studentInfoI = new Intent(MyStudentActivity.this, CoursesInfoActivity.class);
                    studentInfoI.putExtra("key",regNum);
                    startActivity(studentInfoI);
                }
            });

        }else{

            Toast.makeText(MyStudentActivity.this,"Registration Number not found",Toast.LENGTH_LONG).show();

            //Toast error

        }
    }
}