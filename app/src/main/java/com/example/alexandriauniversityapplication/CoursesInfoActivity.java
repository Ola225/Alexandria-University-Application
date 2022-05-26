package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class CoursesInfoActivity extends AppCompatActivity {

    private ArrayList<CoursesModal> coursesModalArrayList;
    private DBHandler dbHandler;
    private CoursesRVAdapter coursesRVAdapter;
    private RecyclerView coursesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_info);




        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String regNum = extras.getString("key");

            coursesModalArrayList = new ArrayList<>();
            dbHandler = new DBHandler(CoursesInfoActivity.this);

            coursesModalArrayList = dbHandler.readCourses(regNum);

            coursesRVAdapter = new CoursesRVAdapter(coursesModalArrayList, CoursesInfoActivity.this);
            coursesRV = findViewById(R.id.idRVCourses);

            // setting layout manager for our recycler view.
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(CoursesInfoActivity.this, RecyclerView.VERTICAL, false);
            coursesRV.setLayoutManager(linearLayoutManager);

            // setting our adapter to recycler view.
            coursesRV.setAdapter(coursesRVAdapter);

        }else{

            Toast.makeText(CoursesInfoActivity.this,"Registration Number not found",Toast.LENGTH_LONG).show();

            //Toast error

        }

    }
}