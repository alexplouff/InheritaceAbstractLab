/*
 * This is the abstract class for the ProgrammingCourse sub-classes
 * All methods are declard here with the toString and getPrerequisites as abstract
 * 
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public abstract class ProgrammingCourse {
    
    private String courseName, prerequisites;
    private int courseNumber;
    private double credits;
    
    
    public void setCourseName(String courseName){
        if( courseName.length() < 4 ){
            System.out.println("Course Name Must Be Atleast Four Characters");
        }
            
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName.toUpperCase();
    }
    
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
   
    public int getCourseNumber() {
        return courseNumber;
    }
    
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    // Preqrequisite getter is a abstract method and is located underneath
    
    public void setCourseCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public double getCourseCredits(){
        return credits;
    }  
    
    //Abstract methods
    
    public abstract String getPrerequisites();
    
    @Override
    public abstract String toString();

}