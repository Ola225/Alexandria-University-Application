package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class BasicInfoActivity extends AppCompatActivity {
    final Calendar myCalendar = Calendar.getInstance();
    Button addStudentBtn;
    EditText dayBirthEdit;
    EditText firstNameEdit;
    EditText middleNameEdit;
    EditText lastNameEdit;
    EditText nationalityEdit;
    EditText studentIdEdit;
    EditText homeAddressEdit;
    EditText genderEdit;
    EditText collegeEdit;
    EditText termEdit;
    EditText yearEdit;
    EditText departmentEdit;
    EditText emailEdit;
    EditText phoneNumberEdit;
    EditText registrationNumberEdit;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        addStudentBtn =(Button) findViewById(R.id.addStudentBtn);

        dayBirthEdit = (EditText) findViewById(R.id.dayBirthEdit);
        firstNameEdit = (EditText) findViewById(R.id.firstNameEdit);
        middleNameEdit = (EditText) findViewById(R.id.middleNameEdit);
        lastNameEdit = (EditText) findViewById(R.id.lastNameEdit);
        nationalityEdit = (EditText) findViewById(R.id.nationalityEdit);
        studentIdEdit = (EditText) findViewById(R.id.studentIdEdit);
        homeAddressEdit = (EditText) findViewById(R.id.homeAddressEdit);
        genderEdit = (EditText) findViewById(R.id.genderEdit);
        collegeEdit = (EditText) findViewById(R.id.collegeEdit);
        termEdit = (EditText) findViewById(R.id.termEdit);
        yearEdit = (EditText) findViewById(R.id.yearEdit);
        departmentEdit = (EditText) findViewById(R.id.departmentEdit);
        emailEdit = (EditText) findViewById(R.id.emailEdit);
        phoneNumberEdit = (EditText) findViewById(R.id.mobilePhoneEdit);
        registrationNumberEdit = (EditText) findViewById(R.id.registrationNumberEdit);

        dbHandler = new DBHandler(BasicInfoActivity.this);


        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {

                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, day);
                updateLabel();
            }
        };

        dayBirthEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(BasicInfoActivity.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        addStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameEdit.getText().toString();
                String middleName = middleNameEdit.getText().toString();
                String lastName = lastNameEdit.getText().toString();
                String nationality = nationalityEdit.getText().toString();
                String studentId = studentIdEdit.getText().toString();
                String homeAddress = homeAddressEdit.getText().toString();
                String gender = genderEdit.getText().toString();
                String college = collegeEdit.getText().toString();
                String term = termEdit.getText().toString();
                String year = yearEdit.getText().toString();
                String department = departmentEdit.getText().toString();
                String email = emailEdit.getText().toString();
                String phoneNumber = phoneNumberEdit.getText().toString();
                String registrationNumber = registrationNumberEdit.getText().toString();
                String age = dayBirthEdit.getText().toString();

                if(firstName.isEmpty()||middleName.isEmpty()||lastName.isEmpty()||
                        nationality.isEmpty()||studentId.isEmpty()||homeAddress.isEmpty()||
                        gender.isEmpty()||college.isEmpty()||term.isEmpty()||year.isEmpty()||
                        department.isEmpty()||email.isEmpty()||phoneNumber.isEmpty()||registrationNumber.isEmpty()){
                    Toast.makeText(BasicInfoActivity.this,"Please enter all the data to add the student",Toast.LENGTH_LONG).show();

                }else{
                    dbHandler.addNewStudent(firstName,middleName,lastName,nationality,studentId,homeAddress,age,gender,college,term,year,department,email,phoneNumber,registrationNumber);
                    Toast.makeText(BasicInfoActivity.this,"Student Added Successfully",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void updateLabel() {
        String myFormat = "MM/dd/yy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
        dayBirthEdit.setText(dateFormat.format(myCalendar.getTime()));
    }
}
