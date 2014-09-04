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
    
    private String courseName;
    private int courseNumber;
    private double credits;
    
    public ProgrammingCourse( String courseName , int courseNumber
                                    , double credits){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    
    //course name
    public void setCourseName(String courseName) {
        if( courseName == null){
            System.out.println("Course Name Can NOT Be Empty");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    // course number
    public void setCourseNumber(int courseNumber) {
        if( courseNumber == 0 ) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
     this.courseNumber = courseNumber;
    }
   
    public int getCourseNumber(){
        return courseNumber;
    }
    
    // credits
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
    
    
    @Override
    public String toString(){
        return "Course Name: " + getCourseName()
                +"\nCourse Number: " + getCourseNumber()
                +"\nCredits: " + getCourseCredits();
    }
    
}