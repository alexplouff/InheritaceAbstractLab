package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this class is to declare the properties, write the appropriate
 * getters/setters, and override the toString method for the Intro to Programming Course
 * 
 * This Course has no prerequisite
 *
 * @author      Alex Plouff
 * @version     1.00
 */

public class IntroToProgramming extends ProgrammingCourse {
   
    private String courseName;
    private int courseNumber;
    private double credits;
    private String prerequisites;
    
    
    @Override
    public void setCourseName(String courseName){
        if( courseName.length() < 4 ){
            System.out.println("Course Name Must Be Atleast Four Characters");
        }
            
        this.courseName = courseName;
    }
    
    @Override
    public String getCourseName(){
        return courseName.toUpperCase();
    }
    
    @Override
    public void setCourseNumber(int courseNumber){
        this.courseNumber = courseNumber;
    }
    
    @Override
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

    public String getPrerequisites() {
        return prerequisites;
    }
        
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
    
     public String toString(){
        
        return 
                "Course Name: " + getCourseName()+
                "\nCourse Number: " + getCourseNumber()+
                "\nCredit Amount: " + getCourseCredits()+
                "\nPrerequistie: " + getPrerequisites();               
    }
}
