package com.EnusA.Prac2_2;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    ArrayList<Student> studList = new ArrayList();
    public void addStudent(String nm, String sn, String sNum, String crs, int age)
    {
        Student newStud = new Student(nm,sn,sNum,crs,age);
        System.out.println(newStud.toSTring());
        studList.add(newStud);
        System.out.println("Student has been added\n\n");
    }

    public void findStudent(String studNo)
    {
        Student st = new Student();
        int i = studList.size();
        for (int j = 0; j != i; j++)
        {
            if (studList.get(j).getStudNum() == studNo)
            {
                st.setStudName(studList.get(j).getStudName());
                st.setStudSName(studList.get(j).getStudSName());
                st.setStudNum(studList.get(j).getStudNum());
                st.setStudAge(studList.get(j).getStudAge());
                st.setCourse(studList.get(j).getCourse());
                break;
            }
        }
        System.out.println("student has been found\n" + st.toSTring());
    }

    public void deleteStudent(String studNo)
    {
        Student st = new Student();
        int i = studList.size();
        for (int j = 0; j <= i; j++)
        {
            if (studList.get(j).getStudNum() == studNo)
            {
                studList.remove(j);
            }
            break;
        }
        System.out.println("The student record has been deleted...");
    }

    public void updateStudent(String studNo, String nm,String sn, String crs, int age)
    {
        int i = studList.size();
        for (int j = 0; j <= i; j++)
        {
            if (studList.get(j).getStudNum() == studNo)
            {
                studList.get(j).setStudSName(nm);
                studList.get(j).setStudSName(sn);
                studList.get(j).setStudNum(studNo);
                studList.get(j).setStudAge(age);
                studList.get(j).setCourse(crs);
            }
            break;
        }
        System.out.println("The student record has been updated...");
    }

    public static void main(String[]args){
        App methods = new App();
        System.out.println("Adding Students");
        methods.addStudent("Abdullah","Enus","214018318","ND IT",21);
        methods.addStudent("Greyam","Moorcroft","213037513","ND IT",23);
        methods.addStudent("Gavin","Free","2125496352","Masters in Film",30);
        methods.addStudent("Taylor","Jones","2356487954","ND IT",20);
        methods.addStudent("Michael","Jones","1956487542","Masters IT",32);

        System.out.println("Finding Student...");
        methods.findStudent("213037513");

        System.out.println("\nDeleting a Student...");
        methods.deleteStudent("213037513");

        System.out.println("\nUpdating a Student...");
        methods.updateStudent("214018318", "Abdullah", "Enus", "BTech IT", 23);

        System.out.println("\nProject Complete... Thank you for testing");
    }
}
