package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentActivity extends AppCompatActivity {

    Button logInBtn ;
    EditText registrationNumberLoginEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        logInBtn = (Button) findViewById(R.id.logInBtn);
        registrationNumberLoginEdit = (EditText) findViewById(R.id.registrationNumberLoginEdit);

        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regNumber = registrationNumberLoginEdit.getText().toString();
                Intent studentInfoI = new Intent(StudentActivity.this, MyStudentActivity.class);
                studentInfoI.putExtra("key",regNumber);
                startActivity(studentInfoI);
            }
        });




    }
}