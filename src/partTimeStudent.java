/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author supre
 */
public class partTimeStudent extends student {
    private int numOfCourses;

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public partTimeStudent(int numOfCourses, int sId, String Sname, String Address) {
        super(sId, Sname, Address);
        this.numOfCourses = numOfCourses;
    }

    
    
}
