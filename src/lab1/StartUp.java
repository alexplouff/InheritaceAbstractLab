/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Alex
 * What I liked about the abstract class design is that it can really save a lot
 * of time as long as the rest of the classes are going to implement those 
 * methods. 
 * 
 * What I don't like about the abstract class design is that if you're not 
 * careful you can inherit a lot of unnecessary code if you don't keep on top 
 * of what you're doing.
 * 
 * Something to look into is the abstract class constructor.
 * 
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
         
         for(ProgrammingCourse course : courses)
             System.out.println(course+"\n");
    }
        
}
