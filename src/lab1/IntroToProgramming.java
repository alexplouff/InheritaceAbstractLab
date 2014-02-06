package lab1;

import javax.swing.JOptionPane;

/**
 *  The purpose of this class is to override the toString/prerequisite method for the Intro to Java Course
 * 
 * This Course has no prerequisite
 *
 * @author      Alex Plouff
 * @version     1.00
 */

public class IntroToProgramming extends ProgrammingCourse {
    
    public void setCourseName(String courseName){
                if( courseName.length() < 4 ){
            System.out.println("Course Name Must Be Atleast Four Characters");
        }
                this.setCourseName(courseName);
    }
    
    public void setCourseNumber(int courseNumber){
                if( courseNumber < 100 || courseNumber > 999){
                    System.out.println("Course Number must start higher than 100 and less than 999");
                }
                this.setCourseNumber(courseNumber);
    }
        
    public String getPrerequisites(){
        return "None";
    }
    
     public String toString(){
        
        return 
                "Course Name: " + getCourseName()+
                "\nCourse Number: " + getCourseNumber()+
                "\nCredit Amount: " + getCourseCredits()+
                "\nPrerequistie: " + getPrerequisites();               
    }
}
