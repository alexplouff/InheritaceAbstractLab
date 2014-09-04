package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    private int courseNumber;
    
    public IntroToProgrammingCourse(String courseName, int courseNumber, double credits ) {
        super(courseName, courseNumber, credits);
    }

    @Override
    public void setCourseNumber(int courseNumber) {
        if( courseNumber == 0 || courseNumber != 101 ) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
     this.courseNumber = courseNumber;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }

}



