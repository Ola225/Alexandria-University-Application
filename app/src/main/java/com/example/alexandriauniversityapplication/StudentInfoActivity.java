package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentInfoActivity extends AppCompatActivity {

    private ArrayList<StudentModal> studentModalArrayList;
    private DBHandler dbHandler;
    private StudentRVAdapter studentRVAdapter;
    private RecyclerView studentRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String regNum = extras.getString("key");

            studentModalArrayList = new ArrayList<>();
            dbHandler = new DBHandler(StudentInfoActivity.this);

            studentModalArrayList = dbHandler.readStudentInfo(regNum);

            studentRVAdapter = new StudentRVAdapter(studentModalArrayList, StudentInfoActivity.this);
            studentRV = findViewById(R.id.idRVStudent);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(StudentInfoActivity.this, RecyclerView.VERTICAL, false);
            studentRV.setLayoutManager(linearLayoutManager);

            studentRV.setAdapter(studentRVAdapter);

        }else{

            Toast.makeText(StudentInfoActivity.this,"Registration Number not found",Toast.LENGTH_LONG).show();

            //Toast error

        }



    }
}