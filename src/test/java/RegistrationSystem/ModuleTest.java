
package RegistrationSystem;

import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * @author Ronan Larkin
 */

public class ModuleTest {
    
    public ModuleTest() {
    }
    
    Module module;
    
    @BeforeEach                                         
    void setUp() {
        module = new Module("Software Engineering", "CT417");
        module.setAssociatedCourses(new String[]{"Computer Science", "Engineering"});
        module.setStudents(new String[]{"John", "William", "Patrick", "Sarah"});
    }

    /**
     * Test of getModuleName method, of class Module.
     */
    @Test
    public void testGetModuleName() {
        assertEquals("Software Engineering", module.getModuleName());
    }

    /**
     * Test of setModuleName method, of class Module.
     */
    @Test
    public void testSetModuleName() {
        module.setModuleName("Machine Learning");
        assertEquals("Machine Learning", module.getModuleName());
    }

    /**
     * Test of getModID method, of class Module.
     */
    @Test
    public void testGetModID() {
        assertEquals("CT417", module.getModID());
    }

    /**
     * Test of setModID method, of class Module.
     */
    @Test
    public void testSetModID() {
        module.setModID("CT4101");
        assertEquals("CT4101", module.getModID());
    }

    /**
     * Test of getAssociatedCourses method, of class Module.
     */
    @Test
    public void testGetAssociatedCourses() {
        Assert.assertArrayEquals(new String[]{"Computer Science", "Engineering"}, module.getAssociatedCourses());
    }

    /**
     * Test of setAssociatedCourses method, of class Module.
     */
    @Test
    public void testSetAssociatedCourses() {
        module.setAssociatedCourses(new String[] {"Medicine", "Nursing"});
        Assert.assertArrayEquals(new String[]{"Medicine", "Nursing"}, module.getAssociatedCourses());
    }

    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        Assert.assertArrayEquals(new String[]{"John", "William", "Patrick", "Sarah"}, module.getStudents());
    }

    /**
     * Test of setStudents method, of class Module.
     */
    @Test
    public void testSetStudents() {
        module.setStudents(new String[]{"Maurice", "Karl", "Danielle", "Orla"});
        Assert.assertArrayEquals(new String[]{"Maurice", "Karl", "Danielle", "Orla"}, module.getStudents());
    }
    
}
