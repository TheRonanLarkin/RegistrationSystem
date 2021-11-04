
package RegistrationSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import org.junit.Assert;

/*
 * @author Ronan Larkin
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    Course course;
    
    @BeforeEach                                         
    void setUp() {
        course = new Course("Medicine");
        course.setModules(new String[]{"MD4101", "MD561", "MD417"});
        course.setStudents(new String[]{"John", "William", "Patrick", "Sarah"});
        DateTime s = new DateTime(2021, 9, 1, 9, 0);
        DateTime e = new DateTime(2022, 4, 30, 19, 0);
        course.setStartDate(s);
        course.setEndDate(e);
                
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        assertEquals("Medicine", course.getCourseName());
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        course.setCourseName("Computer Science");
        assertEquals("Computer Science", course.getCourseName());
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        Assert.assertArrayEquals(new String[]{"John", "William", "Patrick", "Sarah"}, course.getStudents());
    }

    /**
     * Test of setStudents method, of class Course.
     */
    @Test
    public void testSetStudents() {
        course.setStudents(new String[]{"Maurice", "Karl", "Danielle", "Orla"});
        Assert.assertArrayEquals(new String[]{"Maurice", "Karl", "Danielle", "Orla"}, course.getStudents());
    }

    /**
     * Test of getModules method, of class Course.
     */
    @Test
    public void testGetModules() {
        Assert.assertArrayEquals(new String[]{"MD4101", "MD561", "MD417"}, course.getModules());
    }

    /**
     * Test of setModules method, of class Course.
     */
    @Test
    public void testSetModules() {
        course.setModules(new String[]{"CT4101", "CT561", "CT417"});
        Assert.assertArrayEquals(new String[]{"CT4101", "CT561", "CT417"}, course.getModules());
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    @Test
    public void testGetStartDate() {
        assertEquals(new DateTime(2021, 9, 1, 9, 0), course.getStartDate());
    }

    /**
     * Test of setStartDate method, of class Course.
     */
    @Test
    public void testSetStartDate() {
        course.setEndDate(new DateTime(2021, 10, 10, 9, 0));
        assertEquals(new DateTime(2021, 10, 10, 9, 0), course.getEndDate());
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    @Test
    public void testGetEndDate() {
        assertEquals(new DateTime(2022, 4, 30, 19, 0), course.getEndDate());
    }

    /**
     * Test of setEndDate method, of class Course.
     */
    @Test
    public void testSetEndDate() {
        course.setEndDate(new DateTime(2022, 5, 1, 19, 0));
        assertEquals(new DateTime(2022, 5, 1, 19, 0), course.getEndDate());
    }
    
}
