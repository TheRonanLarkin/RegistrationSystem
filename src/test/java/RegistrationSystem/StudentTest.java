
package RegistrationSystem;

import java.time.LocalDate;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * @author Ronan Larkin
 */

public class StudentTest {
    
    public StudentTest() {
    }
        Student student;
        
        @BeforeEach                                         
    void setUp() {
        student = new Student("Ronan", "User", 23, 16415192);
        student.setDob(LocalDate.of(1997, 12, 21));
        student.setCourses(new String[]{"Computer Science"});
        student.setModules(new String[]{"CT4101", "CT561", "CT417"});
    }
    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() { 
        assertEquals("Ronan", student.getName());
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        student.setName("John");
        assertEquals("John", student.getName());
        
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        assertEquals("Ronan23", student.getUsername());
    }

    /**
     * Test of setUsername method, of class Student.
     */
    @Test
    public void testSetUsername() {
        student.setUsername("John22");
        assertEquals("John22", student.getUsername());
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        assertEquals(23, student.getAge());
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        student.setAge(22);
        assertEquals(22, student.getAge());
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        assertEquals(LocalDate.of(1997, 12, 21), student.getDob());
    }

    /**
     * Test of setDob method, of class Student.
     */
    @Test
    public void testSetDob() {
        student.setDob(LocalDate.of(1998, 11, 13));
        assertEquals(LocalDate.of(1998, 11, 13), student.getDob());
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        assertEquals(16415192, student.getID());
    }

    /**
     * Test of setID method, of class Student.
     */
    @Test
    public void testSetID() {
        student.setID(17141529);
        assertEquals(17141529, student.getID());
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        Assert.assertArrayEquals(new String[]{"Computer Science"}, student.getCourses());
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        student.setCourses(new String[]{"Medicine"});
        Assert.assertArrayEquals(new String[]{"Medicine"}, student.getCourses());
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        Assert.assertArrayEquals(new String[]{"CT4101", "CT561", "CT417"}, student.getModules());
    }

    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        student.setModules(new String[]{"MD4101", "MD561", "MD417"});
    }
    
}
