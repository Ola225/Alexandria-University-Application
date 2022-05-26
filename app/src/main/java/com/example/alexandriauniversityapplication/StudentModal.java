package com.example.alexandriauniversityapplication;

public class StudentModal {

    private String firstName;
    private String middleName;
    private String lastName;
    private String nationality;
    private String studentId;
    private String homeAddress;
    private String gender;
    private String college;
    private String term;
    private String year;
    private String department;
    private String email;
    private String phoneNumber;
    private String registrationNumber;
    private String age;
    private int id;

    public StudentModal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public StudentModal(String firstName, String middleName, String lastName, String nationality,
                        String studentId, String homeAddress, String gender, String college, String term,
                        String year, String department, String email, String phoneNumber, String registrationNumber, String age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.studentId = studentId;
        this.homeAddress = homeAddress;
        this.gender = gender;
        this.college = college;
        this.term = term;
        this.year = year;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registrationNumber = registrationNumber;
        this.age = age;
    }
}
