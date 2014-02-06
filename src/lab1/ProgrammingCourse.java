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
    
    

    
    public abstract void setCourseName(String courseName);
    
    public final String getCourseName(){
        return courseName.toUpperCase();
    }
    
    public abstract void setCourseNumber(int courseNumber);
   
    public final int getCourseNumber() {
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
    
    public abstract String getPrerequisites();
    
    public void setCourseCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public final double getCourseCredits(){
        return credits;
    }  
    
    @Override
    public abstract String toString();

}