/*
 * This is the abstract class for the ProgrammingCourse sub-classes
 * 
 */

package lab1;

/**
 *
 * @author Alex
 */
public abstract class ProgrammingCourse {
    
    private String courseName;
    private int courseNumber;
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
  
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    public int getCourseNumber(){
        return courseNumber;
    }
    
    public abstract void setPrerequisites(String prerequisites);
    
    public abstract String getPrerequisites();
    
    public abstract void setCourseCredits(double credits);
    
    public abstract double getCourseCredits();   
    
    @Override
    public abstract String toString();

}