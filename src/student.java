/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Commenting for the modification on jan 17th at 9:48 AM
 * @author Harsimran Singh
 */
public class student {
    private int sId;
    private String Sname;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public student(int sId, String Sname) {
        this.sId = sId;
        this.Sname = Sname;
    }
    
}
