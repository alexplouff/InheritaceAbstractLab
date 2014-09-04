package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String prerequisite;
    
    public IntroJavaCourse(String courseName, int courseNumber,     
                                double credits , String prerequisite) {
        super(courseName, courseNumber, credits);
        this.prerequisite = prerequisite;
    }

    public void setPrerequisites(String prerequisite) {
        if(prerequisite == null || prerequisite.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisite = prerequisite;
    }

    public String getPrerequisite(){
        return prerequisite;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nPrerequisite: " + prerequisite;
    }

}
    
    

   


