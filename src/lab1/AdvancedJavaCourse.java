package lab1;


/**
 * The purpose of this class is to override the toString/prerequisite method for the Intro to Java Course
 * 
 * This Course has two prerequisites
 * 
 * @author      Alex Plouff
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{

     public String getPrerequisites(){
        return "Intro To Programming, 101 \n"
                +"Intro To Java, 102";
    }
    
     public String toString(){
        
        return 
                "Course Name: " + getCourseName()+
                "\nCourse Number: " + getCourseNumber()+
                "\nCredit Amount: " + getCourseCredits()+
                "\nPrerequistie: " + getPrerequisites();               
    }
            
}
