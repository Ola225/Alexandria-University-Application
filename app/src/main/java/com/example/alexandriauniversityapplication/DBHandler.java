package com.example.alexandriauniversityapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "universityDb";

    // below int is our database version
    private static final int DB_VERSION = 2;

    // below variable is for our table name.
    private static final String TABLE_NAME = "studentname";

    // below variable is for our id column.
    private static final String ID_COL = "id";

    // below variable is for our course name column
    private static final String FIRST_NAME_COL = "first_name";

    private static final String MIDDLE_NAME_COL = "middle_name";

    private static final String LAST_NAME_COL = "last_name";

    private static final String REG_NUMB_COL = "registration_number";

    private static final String NATIONALITY_COL = "nationality";

    private static final String STUDENT_ID_COL = "student_id";

    private static final String HOME_ADDRESS_COL = "home_address";

    private static final String AGE_COL = "age";

    private static final String GENDER_COL = "gender";

    private static final String COLLEGE_COL = "college";

    private static final String TERM_COL = "term";

    private static final String YEAR_COL = "year";

    private static final String DEPARTMENT_COL = "department";

    private static final String EMAIL_COL = "email";

    private static final String MOBILE_PHONE_COL = "mobile_phone_number";


    private static final String COURSE_TABLE_NAME = "courses";

    // below variable is for our id column.
    private static final String COURSE_ID_COL = "id";

    private static final String COURSES_REG_NUMB_COL = "registration_number";

    // below variable is for our course name column
    private static final String COURSE_CODE_COL = "course_code";

    private static final String COURSE_NAME_COL = "course_name";

    private static final String COURSE_CREDIT_HOURS_COL = "credit_hours";

    private static final String COURSE_NUM_TAKING_COURSE_COL = "num_taking_course";

    private static final String COURSE_SEMESTER_COL = "semester";

    private static final String COURSE_YEAR_COL = "year";

    private static final String COURSE_LECTURER_FIRST_COL = "lecturer_first";

    private static final String COURSE_LECTURER_MIDDLE_COL = "lecturer_middle";

    private static final String COURSE_LECTURER_LAST_COL = "lecturer_last";

    private static final String COURSE_GTA_FIRST_COL = "gta_first";

    private static final String COURSE_GTA_MIDDLE_COL = "gta_middle";

    private static final String COURSE_GTA_LAST_COL = "gta_last";

    private static final String COURSE_EXAM_30_COL = "exam_thirty";

    private static final String COURSE_EXAM_20_COL = "exam_twenty";

    private static final String COURSE_WORK_COL = "work";

    private static final String COURSE_FINAL_EXAM_COL = "final_exam";

    private static final String COURSE_SUM_COL = "sum";

    private static final String COURSE_GRADE_COL = "grade";

    private static final String COURSE_ABSENCE_COL = "absence";

    private Context context;

    private static final String CREATE_TABLE_STUDENTS = "CREATE TABLE " + TABLE_NAME + " ("
            + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + FIRST_NAME_COL + " TEXT,"
            + MIDDLE_NAME_COL + " TEXT,"
            + LAST_NAME_COL + " TEXT,"
            + NATIONALITY_COL + " TEXT,"
            + STUDENT_ID_COL + " TEXT,"
            + HOME_ADDRESS_COL + " TEXT,"
            + AGE_COL + " Text,"
            + GENDER_COL + " TEXT,"
            + COLLEGE_COL + " TEXT,"
            + TERM_COL + " TEXT,"
            + YEAR_COL + " TEXT,"
            + DEPARTMENT_COL + " TEXT,"
            + EMAIL_COL + " TEXT,"
            + MOBILE_PHONE_COL + " TEXT,"
            + REG_NUMB_COL + " TEXT)";

    private static final String CREATE_TABLE_COURSES = "CREATE TABLE " + COURSE_TABLE_NAME + " ("
            + COURSE_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COURSES_REG_NUMB_COL + " TEXT,"
            + COURSE_CODE_COL + " TEXT,"
            + COURSE_NAME_COL + " TEXT,"
            + COURSE_CREDIT_HOURS_COL + " TEXT,"
            + COURSE_NUM_TAKING_COURSE_COL + " TEXT,"
            + COURSE_SEMESTER_COL + " TEXT,"
            + COURSE_YEAR_COL + " TEXT,"
            + COURSE_LECTURER_FIRST_COL + " Text,"
            + COURSE_LECTURER_MIDDLE_COL + " TEXT,"
            + COURSE_LECTURER_LAST_COL + " TEXT,"
            + COURSE_GTA_FIRST_COL + " TEXT,"
            + COURSE_GTA_MIDDLE_COL + " TEXT,"
            + COURSE_GTA_LAST_COL + " TEXT,"
            + COURSE_EXAM_30_COL + " TEXT,"
            + COURSE_EXAM_20_COL + " TEXT,"
            + COURSE_WORK_COL + " TEXT,"
            + COURSE_FINAL_EXAM_COL + " TEXT,"
            + COURSE_SUM_COL + " TEXT,"
            + COURSE_GRADE_COL + " TEXT,"
            + COURSE_ABSENCE_COL + " TEXT)";










    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context=context;
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        /*
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FIRST_NAME_COL + " TEXT,"
                + MIDDLE_NAME_COL + " TEXT,"
                + LAST_NAME_COL + " TEXT,"
                + NATIONALITY_COL + " TEXT,"
                + STUDENT_ID_COL + " TEXT,"
                + HOME_ADDRESS_COL + " TEXT,"
                + AGE_COL + " Text,"
                + GENDER_COL + " TEXT,"
                + COLLEGE_COL + " TEXT,"
                + TERM_COL + " TEXT,"
                + YEAR_COL + " TEXT,"
                + DEPARTMENT_COL + " TEXT,"
                + EMAIL_COL + " TEXT,"
                + MOBILE_PHONE_COL + " TEXT,"
                + REG_NUMB_COL + " TEXT)";

        String query2 = "CREATE TABLE " + COURSE_TABLE_NAME + " ("
                + COURSE_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COURSES_REG_NUMB_COL + " TEXT,"
                + COURSE_CODE_COL + " TEXT,"
                + COURSE_NAME_COL + " TEXT,"
                + COURSE_CREDIT_HOURS_COL + " TEXT,"
                + COURSE_NUM_TAKING_COURSE_COL + " TEXT,"
                + COURSE_SEMESTER_COL + " TEXT,"
                + COURSE_YEAR_COL + " TEXT,"
                + COURSE_LECTURER_FIRST_COL + " Text,"
                + COURSE_LECTURER_MIDDLE_COL + " TEXT,"
                + COURSE_LECTURER_LAST_COL + " TEXT,"
                + COURSE_GTA_FIRST_COL + " TEXT,"
                + COURSE_GTA_MIDDLE_COL + " TEXT,"
                + COURSE_GTA_LAST_COL + " TEXT,"
                + COURSE_EXAM_30_COL + " TEXT,"
                + COURSE_EXAM_20_COL + " TEXT,"
                + COURSE_WORK_COL + " TEXT,"
                + COURSE_FINAL_EXAM_COL + " TEXT,"
                + COURSE_SUM_COL + " TEXT,"
                + COURSE_GRADE_COL + " TEXT,"
                + COURSE_ABSENCE_COL + " TEXT)";
*/
        // at last we are calling a exec sql
        // method to execute above sql query

        db.execSQL(CREATE_TABLE_STUDENTS);
        db.execSQL(CREATE_TABLE_COURSES);
    }

    // this method is use to add new course to our sqlite database.
    public void addNewStudent(
            String first_name,
            String middle_name,
            String last_name,
            String nationality,
            String student_id,
            String home_address,
            String age,
            String gender,
            String college,
            String term,
            String year,
            String department,
            String email,
            String mobile_phone_number,
            String registration_number

            ) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();

        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        values.put(FIRST_NAME_COL, first_name);
        values.put(MIDDLE_NAME_COL, middle_name);
        values.put(LAST_NAME_COL, last_name);
        values.put(NATIONALITY_COL, nationality);
        values.put(STUDENT_ID_COL, student_id);
        values.put(HOME_ADDRESS_COL, home_address);
        values.put(AGE_COL, age);
        values.put(GENDER_COL, gender);
        values.put(COLLEGE_COL, college);
        values.put(TERM_COL, term);
        values.put(YEAR_COL, year);
        values.put(DEPARTMENT_COL, department);
        values.put(EMAIL_COL, email);
        values.put(MOBILE_PHONE_COL, mobile_phone_number);
        values.put(REG_NUMB_COL, registration_number);



        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our
        // database after adding database.
        db.close();
    }

    public ArrayList<StudentModal> readStudentInfo(String regNum) {
        // on below line we are creating a
        // database for reading our database.
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorStudent = db.rawQuery("SELECT * FROM " + TABLE_NAME + " where " + REG_NUMB_COL + "='" + regNum + "'" , null);

        ArrayList<StudentModal> studentModalArrayList = new ArrayList<>();

        if(cursorStudent.moveToFirst()){
            do{
                studentModalArrayList.add(
                        new StudentModal(
                                cursorStudent.getString(1),cursorStudent.getString(2),
                                cursorStudent.getString(3),cursorStudent.getString(4),
                                cursorStudent.getString(5),cursorStudent.getString(6),
                                cursorStudent.getString(7),cursorStudent.getString(8),
                                cursorStudent.getString(9),cursorStudent.getString(10),
                                cursorStudent.getString(11),cursorStudent.getString(12),
                                cursorStudent.getString(13),cursorStudent.getString(14),
                                cursorStudent.getString(15)));
            }while (cursorStudent.moveToNext());
        }
        cursorStudent.close();
        return studentModalArrayList;
    }


    public void addNewCourse(
            String registration_number,
            String code,
            String name,
            String credit_hours,
            String num_taking_course,
            String semester,
            String year,
            String lecturer_first_name,
            String lecturer_middle_name,
            String lecturer_last_name,
            String gta_first_name,
            String gta_middle_name,
            String gta_last_name,
            String exam_out_30,
            String exam_out_20,
            String work,
            String final_exam,
            String sum,
            String grade,
            String absence_percentage

            ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues coursesValues = new ContentValues();

        coursesValues.put(COURSES_REG_NUMB_COL, registration_number);
        coursesValues.put(COURSE_CODE_COL, code);
        coursesValues.put(COURSE_NAME_COL, name);
        coursesValues.put(COURSE_CREDIT_HOURS_COL, credit_hours);
        coursesValues.put(COURSE_NUM_TAKING_COURSE_COL, num_taking_course);
        coursesValues.put(COURSE_SEMESTER_COL, semester);
        coursesValues.put(COURSE_YEAR_COL, year);
        coursesValues.put(COURSE_LECTURER_FIRST_COL, lecturer_first_name);
        coursesValues.put(COURSE_LECTURER_MIDDLE_COL, lecturer_middle_name);
        coursesValues.put(COURSE_LECTURER_LAST_COL, lecturer_last_name);
        coursesValues.put(COURSE_GTA_FIRST_COL, gta_first_name);
        coursesValues.put(COURSE_GTA_MIDDLE_COL, gta_middle_name);
        coursesValues.put(COURSE_GTA_LAST_COL, gta_last_name);
        coursesValues.put(COURSE_EXAM_30_COL, exam_out_30);
        coursesValues.put(COURSE_EXAM_20_COL, exam_out_20);
        coursesValues.put(COURSE_WORK_COL, work);
        coursesValues.put(COURSE_FINAL_EXAM_COL, final_exam);
        coursesValues.put(COURSE_SUM_COL, sum);
        coursesValues.put(COURSE_GRADE_COL, grade);
        coursesValues.put(COURSE_ABSENCE_COL, absence_percentage);

        db.insert(COURSE_TABLE_NAME, null, coursesValues);
        db.close();

    }

    public ArrayList<CoursesModal> readCourses(String regNum) {
        // on below line we are creating a
        // database for reading our database.
        SQLiteDatabase db = this.getReadableDatabase();

        // on below line we are creating a cursor with query to read data from database.
        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + COURSE_TABLE_NAME + " where " + REG_NUMB_COL + "='" + regNum + "'" , null);


        // on below line we are creating a new array list.
        ArrayList<CoursesModal> coursesModalArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {
                // on below line we are adding the data from cursor to our array list.
                coursesModalArrayList.add(
                        new CoursesModal(
                                cursorCourses.getString(1), cursorCourses.getString(2),
                                cursorCourses.getString(3), cursorCourses.getString(4),
                                cursorCourses.getString(5),cursorCourses.getString(6),
                                cursorCourses.getString(7),cursorCourses.getString(8),
                                cursorCourses.getString(9),cursorCourses.getString(10),
                                cursorCourses.getString(11),cursorCourses.getString(12),
                                cursorCourses.getString(13),cursorCourses.getString(14),
                                cursorCourses.getString(15),cursorCourses.getString(16),
                                cursorCourses.getString(17),cursorCourses.getString(18),
                                cursorCourses.getString(19),cursorCourses.getString(20)));
            } while (cursorCourses.moveToNext());
            // moving our cursor to next.
        }
        // at last closing our cursor
        // and returning our array list.
        cursorCourses.close();
        return coursesModalArrayList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_NAME + "'");
        db.execSQL("DROP TABLE IF EXISTS '" + COURSE_TABLE_NAME + "'");
        onCreate(db);
    }

}






//cursor =  this.db.rawQuery("select * from " + BanksTable.NAME + " where " + BanksTable.COL_NAME + "='" + bankName + "'" , null);
