
package RegistrationSystem;

import java.time.LocalDate;
import java.util.Arrays;

/*
 * @author Ronan Larkin
 */

public class Student {

    private static String name, username;
    private static int age;
    private LocalDate dob;
    private int ID;
    private String[] courses, modules;

    public Student(String name, String username, int age, int ID) {
        this.name = name;
        this.username = username;
        this.age = age;
        this.ID = ID;
        
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getUsername() {
        username = name + age ;
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }    
    
     @Override
    public String toString(){
        return username + " Courses: " + Arrays.toString(courses) + " Modules: " + Arrays.toString(modules);
                
    } 
    
}
