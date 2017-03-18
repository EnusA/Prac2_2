package com.EnusA.Prac2_2;

/**
 * Created by enusa on 2017/03/18.
 */
public class Student {
    private String studName;
    private String studSName;
    private String studNum;
    private String course;
    private int studAge;

    public Student() {}
    public Student(String nm, String sn, String sNum, String crs, int age)
    {
        studName = nm;
        studSName = sn;
        studNum = sNum;
        course = crs;
        studAge = age;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudSName() {
        return studSName;
    }

    public void setStudSName(String studSName) {
        this.studSName = studSName;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public String toSTring()
    {
        return ("Name: "+studName + "\nSurname: " + studSName + "\nStudent Number: " + studNum + "\nAge:"
                + studAge + "\nCourse: " + course);
    }
}
