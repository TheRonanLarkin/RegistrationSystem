
package RegistrationSystem;


/*
 * @author Ronan Larkin
 */

public class Module {
    
    private String moduleName, modID;
    private String[] associatedCourses, students;
    
    public Module(String moduleName, String modID) {
        this.moduleName = moduleName;
        this.modID = modID;
        this.associatedCourses = associatedCourses;
        this.students = students;  
        
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public String[] getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(String[] associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }
    
}
