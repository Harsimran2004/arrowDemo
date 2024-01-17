/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author supre
 */
public class studentList {
    
    public static void main(String[] args){
        student s1 = new student(1,"arsh");
        student[] studentList = new student[3];
        studentList[0] = s1;
        System.out.println("Third commit");
        studentList[0] = new student(2,"abd");
        studentList[0] = new student(3,"bds");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getSname());
        }
    }
    
}
