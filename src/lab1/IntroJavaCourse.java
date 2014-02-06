package lab1;

/**
 * The purpose of this class is to override the toString/prerequisite method for the Intro to Java Course
 * 
 * This Course has a prerequisite
 * 
 * @author      Alex Plouff
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse  {
    
    public String getPrerequisites(){
        return "Intro To Programming, 102";
    }
    
     public String toString(){
        
        return 
                "Course Name: " + getCourseName()+
                "\nCourse Number: " + getCourseNumber()+
                "\nCredit Amount: " + getCourseCredits()+
                "\nPrerequistie: " + getPrerequisites();               
    }
}
