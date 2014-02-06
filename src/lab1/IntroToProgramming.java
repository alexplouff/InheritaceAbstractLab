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
