package com.example.alexandriauniversityapplication;

public class CoursesModal {
    private String registrationNumber;
    private String code;
    private String course_name;
    private String credit_hours;
    private String num_taking_course;
    private String semester;
    private String year;
    private String lecturer_firstName;
    private String lecturer_middleName;
    private String lecturer_lastName;
    private String GTA_firstName;
    private String GTA_middleName;
    private String GTA_lastName;
    private String exam_out_of_30;
    private String exam_out_of_20;
    private String work;
    private String final_exam;
    private String sum;
    private String grade;
    private String absence;
    private int id;



    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCredit_hours() {
        return credit_hours;
    }

    public void setCredit_hours(String credit_hours) {
        this.credit_hours = credit_hours;
    }

    public String getNum_taking_course() {
        return num_taking_course;
    }

    public void setNum_taking_course(String num_taking_course) {
        this.num_taking_course = num_taking_course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLecturer_firstName() {
        return lecturer_firstName;
    }

    public void setLecturer_firstName(String lecturer_firstName) {
        this.lecturer_firstName = lecturer_firstName;
    }

    public String getLecturer_middleName() {
        return lecturer_middleName;
    }

    public void setLecturer_middleName(String lecturer_middleName) {
        this.lecturer_middleName = lecturer_middleName;
    }

    public String getLecturer_lastName() {
        return lecturer_lastName;
    }

    public void setLecturer_lastName(String lecturer_lastName) {
        this.lecturer_lastName = lecturer_lastName;
    }

    public String getGTA_firstName() {
        return GTA_firstName;
    }

    public void setGTA_firstName(String GTA_firstName) {
        this.GTA_firstName = GTA_firstName;
    }

    public String getGTA_middleName() {
        return GTA_middleName;
    }

    public void setGTA_middleName(String GTA_middleName) {
        this.GTA_middleName = GTA_middleName;
    }

    public String getGTA_lastName() {
        return GTA_lastName;
    }

    public void setGTA_lastName(String GTA_lastName) {
        this.GTA_lastName = GTA_lastName;
    }

    public String getExam_out_of_30() {
        return exam_out_of_30;
    }

    public void setExam_out_of_30(String exam_out_of_30) {
        this.exam_out_of_30 = exam_out_of_30;
    }

    public String getExam_out_of_20() {
        return exam_out_of_20;
    }

    public void setExam_out_of_20(String exam_out_of_20) {
        this.exam_out_of_20 = exam_out_of_20;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getFinal_exam() {
        return final_exam;
    }

    public void setFinal_exam(String final_exam) {
        this.final_exam = final_exam;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAbsence() {
        return absence;
    }

    public void setAbsence(String absence) {
        this.absence = absence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CoursesModal(String registrationNumber, String code, String course_name, String credit_hours, String num_taking_course, String semester, String year, String lecturer_firstName, String lecturer_middleName, String lecturer_lastName, String GTA_firstName, String GTA_middleName, String GTA_lastName, String exam_out_of_30, String exam_out_of_20, String work, String final_exam, String sum, String grade, String absence) {
        this.registrationNumber = registrationNumber;
        this.code = code;
        this.course_name = course_name;
        this.credit_hours = credit_hours;
        this.num_taking_course = num_taking_course;
        this.semester = semester;
        this.year = year;
        this.lecturer_firstName = lecturer_firstName;
        this.lecturer_middleName = lecturer_middleName;
        this.lecturer_lastName = lecturer_lastName;
        this.GTA_firstName = GTA_firstName;
        this.GTA_middleName = GTA_middleName;
        this.GTA_lastName = GTA_lastName;
        this.exam_out_of_30 = exam_out_of_30;
        this.exam_out_of_20 = exam_out_of_20;
        this.work = work;
        this.final_exam = final_exam;
        this.sum = sum;
        this.grade = grade;
        this.absence = absence;

    }
}
