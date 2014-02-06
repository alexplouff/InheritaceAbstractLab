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
        
        
         ProgrammingCourse introPro = new IntroToProgramming();
         
         introPro.setCourseName("intro to programming");
         introPro.setCourseNumber(101);
         introPro.setCourseCredits(3.0);
         introPro.setPrerequisites("None");
         
         System.out.println(introPro.toString() + "\n \n");
         
         ProgrammingCourse javaIntro = new AdvancedJavaCourse();
         
         javaIntro.setCourseName("Intro To Java");
         javaIntro.setCourseNumber(102);
         javaIntro.setCourseCredits(4.0);
         javaIntro.setPrerequisites("Intro To Pogramming");
         
         System.out.println(javaIntro.toString() + "\n \n");
         
         ProgrammingCourse aJc = new AdvancedJavaCourse();

         aJc.setCourseName("Advanced Java Course");
         aJc.setCourseNumber(103);
         aJc.setCourseCredits(4);
         aJc.setPrerequisites("Intro to Prgramming" + "\n"
                            + "Intro to Java");
         
         System.out.println(aJc.toString());
         
    }
}
