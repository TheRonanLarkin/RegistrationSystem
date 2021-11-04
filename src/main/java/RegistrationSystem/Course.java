
package RegistrationSystem;

import java.util.Arrays;
import org.joda.time.DateTime;

/*
 * @author Ronan Larkin
 */

public class Course {
    
    private String courseName;
    private String[] students, modules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = students;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }
 
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    @Override
    public String toString(){
        return courseName + "modules: " + Arrays.toString(modules);
                
    } 
    
}
