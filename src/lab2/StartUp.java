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
public abstract class StartUp implements ProgrammingCourse {
    
    public static void main(String[] args) {
        
        
         ProgrammingCourse introToProgramming = new IntroToProgrammingCourse( 
                    "Intro To Programming" , "101" , 4);
         
         ProgrammingCourse javaIntro = new AdvancedJavaCourse(
                    "Intro To Java" , "201" , 4 , "Intro To Programming");
         
         ProgrammingCourse aJc = new AdvancedJavaCourse(
                    "Advanced Java Course" , "301" , 4 , 
                    "Intro To Programming , Advanced Java");
        
         ProgrammingCourse [] courses = new ProgrammingCourse [3];
         courses[0] = introToProgramming;
         courses[1] = javaIntro;
         courses[2] = aJc;
         
         for( ProgrammingCourse course : courses )
             System.out.println(course+"\n");
         
    }
}
