/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Alex
 */
public interface ProgrammingCourse {
    
    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
    
    public abstract void setCourseName(String courseName);
    public abstract String getCourseName();
    
    public abstract void setCourseNumber(int courseNumber);
    public abstract int getCourseNumber();
    
    public abstract void setCourseCredits(double credits);
    public abstract double getCourseCredits();   
    
    @Override
    public abstract String toString();
    
}
