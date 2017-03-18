package com.EnusA.Prac2_2;

import static org.junit.Assert.*;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.junit.Ignore;
import org.junit.Test;
/**
 * Created by enusa on 2017/03/18.
 */
public class AppTest {
    @Test
    public void testAddStudent() throws Exception {
        Student newStud = new Student("Abdullah","Enus","214018318","ND IT",21);
        assertNotNull("You have forgotten a field it would seem...", newStud);
    }

    @Test
    public void testFindStudent() throws Exception {
        Student newStud = new Student("Abdullah","Enus","214018318","ND IT",21);
        assertEquals("The Student you have searched for does not appear to exist...","214018318",
                newStud.getStudNum());
    }

    @Ignore
    public void testDeleteStudent() throws Exception {
        Student newStud = new Student("Abdullah","Enus","214018318","ND IT",21);
        assertEquals("The Student you wish to delete does not seem to exist...","214018318",
                newStud.getStudNum());
    }

    @Test
    public void testUpdateStudent() throws Exception {
        Student stud = new Student("Abdullah","Enus","214018318","ND IT",21);
        Student copyStud = new Student("Abdullah","Enus","214018318","ND IT",21);

        stud.setStudSName("Abdullah");
        stud.setStudSName("Enus");
        stud.setStudNum("214018318");
        stud.setStudAge(23);
        stud.setCourse("BTech IT");

        assertFalse("The Test has Updated Successfully", EqualsBuilder.reflectionEquals(stud, copyStud));
    }
}