package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgramming implements ProgrammingCourse {
    
    private String courseName;
    private int courseNumber;
    private double credits;
    private String prerequisites; 

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
    
    @Override
    public String toString(){
        
        return 
                "Course Name: " + getCourseName()+
                "\nCourse Number: " + getCourseNumber()+
                "\nCredit Amount: " + getCourseCredits()+
                "\nPrerequistie: " + getPrerequisites();
      
    }

    
}
