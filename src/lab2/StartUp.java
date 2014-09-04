/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Alex
 * 
 * What I like about this architecture is that I used the constructor method
 * to pass in my information which forces the programmer to pass in the correct 
 * values.
 * 
 * What I don't like about this design is that all the necessary information 
 * required to make this work isn't as apparent as it could/should be. For 
 * instance, if I used the setter methods then I would know exactly what to pass
 * in as opposed to seeing a red squiggly line telling me I did it wrong.
 * 
 * As far as using the Liskov substitution principle I can not think of a time
 * when you wouldn't be able to use it. It seems like a necessary thing to use
 * everytime because in my opinion it makes the code easier to read / understand.
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
