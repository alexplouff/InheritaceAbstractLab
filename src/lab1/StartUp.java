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
       
         AdvancedJavaCourse aJc = new AdvancedJavaCourse();

         aJc.setCourseName("Advanced Java Programming");
         aJc.setCourseNumber(301);
         aJc.setCourseCredits(4);
         aJc.setPrerequisites("Intro to prgramming");
         
         aJc.toString();
         
    }
    
}
