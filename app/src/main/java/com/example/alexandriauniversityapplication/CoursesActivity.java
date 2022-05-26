package com.example.alexandriauniversityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CoursesActivity extends AppCompatActivity {

    EditText regNumber,courseCode,courseName,courseCreditHours,courseNumTaking,courseSemester,courseYear,
            courseLecturerFirstName,courseLecturerMiddleName,courseLecturerLastName,
            courseGpaFirstName,courseGpaMiddleName,courseGpaLastName,
            courseExamOutOF30,courseExamOutOf20,courseWork,courseFinalExam,courseGrade,courseAbsence;
    TextView courseSum;
    Button addCourse;
    CoursesModal coursesModal;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        regNumber = (EditText) findViewById(R.id.cRegNumEdt);
        courseCode = (EditText) findViewById(R.id.cCodeEdt);
        courseName = (EditText)findViewById(R.id.cNameEdt);
        courseCreditHours = (EditText) findViewById(R.id.cCreditHoursEdt);
        courseNumTaking = (EditText) findViewById(R.id.cNumTakingCourseEdt);
        courseSemester = (EditText) findViewById(R.id.cSemesterEdt);
        courseYear = (EditText) findViewById(R.id.cYearEdt);
        courseLecturerFirstName = (EditText) findViewById(R.id.cLecturerFirstNameEdt);
        courseLecturerMiddleName = (EditText) findViewById(R.id.cLecturerMiddleNameEdt);
        courseLecturerLastName = (EditText) findViewById(R.id.cLecturerLastNameEdt);
        courseGpaFirstName = (EditText) findViewById(R.id.cGtaFirstNameEdt);
        courseGpaMiddleName = (EditText) findViewById(R.id.cGtaMiddleNameEdt);
        courseGpaLastName = (EditText) findViewById(R.id.cGtaLastNameEdt);
        courseExamOutOF30 = (EditText) findViewById(R.id.cExamOutOf30Edt);
        courseExamOutOf20 = (EditText) findViewById(R.id.cExamOutOf20Edt);
        courseWork = (EditText) findViewById(R.id.cWorkEdt);
        courseFinalExam = (EditText) findViewById(R.id.cFinalExamEdt);
        courseSum = (TextView) findViewById(R.id.cSum);
        courseGrade = (EditText) findViewById(R.id.cGradeEdt);
        courseAbsence = (EditText) findViewById(R.id.cAbsenceEdt);

        addCourse = (Button) findViewById(R.id.addCourseBtn);

        dbHandler = new DBHandler(CoursesActivity.this);

        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cRegNum = regNumber.getText().toString();
                String cCode = courseCode.getText().toString();
                String cName =courseName.getText().toString();
                String cCreditHours = courseCreditHours.getText().toString();
                String cNumTaking = courseNumTaking.getText().toString();
                String cSemester = courseSemester.getText().toString();
                String cYear = courseYear.getText().toString();
                String cLecturerFirstName = courseLecturerFirstName.getText().toString();
                String cLecturerMiddleName = courseLecturerMiddleName.getText().toString();
                String cLecturerLastName = courseLecturerLastName.getText().toString();
                String cGpaFirstName = courseGpaFirstName.getText().toString();
                String cGpaMiddleName = courseGpaMiddleName.getText().toString();
                String cGpaLastName = courseGpaLastName.getText().toString();
                String cExam30 = courseExamOutOF30.getText().toString();
                String cExam20 = courseExamOutOf20.getText().toString();
                String cWork = courseWork.getText().toString();
                String cFinalExam = courseFinalExam.getText().toString();
                String cGrade = courseGrade.getText().toString();
                String cAbsence = courseAbsence.getText().toString();
                if(cRegNum.isEmpty()||cCode.isEmpty()|| cName.isEmpty()||cCreditHours.isEmpty()||cNumTaking.isEmpty()||cSemester.isEmpty()||
                cYear.isEmpty()||cLecturerFirstName.isEmpty()||cLecturerMiddleName.isEmpty()||cLecturerLastName.isEmpty()||
                cGpaFirstName.isEmpty()||cGpaMiddleName.isEmpty()||cGpaLastName.isEmpty()||cExam30.isEmpty()||cExam20.isEmpty()||
                cWork.isEmpty()||cFinalExam.isEmpty()||cGrade.isEmpty()||cAbsence.isEmpty()){
                    Toast.makeText(CoursesActivity.this,"Please Enter Course Full Data",Toast.LENGTH_LONG).show();
                }else if(Integer.parseInt(cExam20)>20||Integer.parseInt(cExam30)>30){
                    Toast.makeText(CoursesActivity.this,"Please Check The Exams Degree, Something Is Wrong :(",Toast.LENGTH_LONG).show();
                }else if(Integer.parseInt(cAbsence)>12){
                    Toast.makeText(CoursesActivity.this,"Absence must be less than 12 Lecture, Something Is Wrong :(",Toast.LENGTH_LONG).show();
                }else{
                    double absencePercentageDouble = (Double.parseDouble(cAbsence)/12)*100;
                    String absencePercent = String.valueOf(absencePercentageDouble)+'%';
                    int sum = Integer.parseInt(cExam30)+Integer.parseInt(cExam20)+Integer.parseInt(cWork)+Integer.parseInt(cFinalExam);
                    String cSum = String.valueOf(sum);


                    dbHandler.addNewCourse(cRegNum,cCode,cName,cCreditHours,cNumTaking,cSemester,cYear,
                            cLecturerFirstName,cLecturerMiddleName,cLecturerLastName,cGpaFirstName,cGpaMiddleName,cGpaLastName,
                            cExam30,cExam20,cWork,cFinalExam,cSum,cGrade,absencePercent);

                    Toast.makeText(CoursesActivity.this,"Course Added Successfully :D",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}