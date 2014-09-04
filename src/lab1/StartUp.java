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
public class StartUp {
    
    
     public static void main(String[] args) {
       
         
         
         ProgrammingCourse introToProgramming = new IntroToProgrammingCourse( 
                            "Intro To Programming Course" , 101 , 4);
         
         ProgrammingCourse introToJava = new IntroJavaCourse(
                            "Intro To Java" , 201 , 4 , "Intro To Programming");
         
         ProgrammingCourse advancedJava = new AdvancedJavaCourse(
                            "Advanced Java " , 202 , 4 , "Intro To Java");
         
         ProgrammingCourse [] courses = new ProgrammingCourse [3];
         
         courses[0] = introToProgramming;
         courses[1] = introToJava;
         courses[2] = advancedJava;
         
         for(ProgrammingCourse c : courses)
             System.out.println(c+"\n");
    }
        
}
