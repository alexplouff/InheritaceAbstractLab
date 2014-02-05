package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Alex Plouff
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{

    private String courseName;
    private int courseNumber;
    private double credits;
    private String prerequisites;
    
    
    public void setCourseName(String courseName){
        if( this.courseName.length() > 4 ){
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
        
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
    
    public double getCredits(){
        return credits;
    }
}
