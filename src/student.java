/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Hello this has been edited from remote
 *This is for fetch and merge
 * @author 
 */
public class student {
    private int sId;
    private String Sname;
    private String Address;

    public student(int sId, String Sname, String Address) {
        this.sId = sId;
        this.Sname = Sname;
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
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
