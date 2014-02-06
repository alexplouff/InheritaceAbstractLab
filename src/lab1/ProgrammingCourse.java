/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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