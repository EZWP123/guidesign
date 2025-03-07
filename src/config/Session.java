/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author SCC_COLLEGE
 */
public class Session {
    private static Session instance;
      private String uid;
    private String u_fname;
    private String u_lname;
    private String u_contact;
    private String u_type;
    private String u_email;
    private String u_un;
   
    private String u_status;

    
    private Session(){
        //Private cons.prevents instance 
  
    }

    public static Session getInstance() {
        return instance;
    }

    public static void setInstance(Session instance) {
        Session.instance = instance;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getU_fname() {
        return u_fname;
    }

    public void setU_fname(String u_fname) {
        this.u_fname = u_fname;
    }

    public String getU_lname() {
        return u_lname;
    }

    public void setU_lname(String u_lname) {
        this.u_lname = u_lname;
    }

    public String getU_contact() {
        return u_contact;
    }

    public void setU_contact(String u_contact) {
        this.u_contact = u_contact;
    }

    public String getU_type() {
        return u_type;
    }

    public void setU_type(String u_type) {
        this.u_type = u_type;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_un() {
        return u_un;
    }

    public void setU_un(String u_un) {
        this.u_un = u_un;
    }

    public String getU_status() {
        return u_status;
    }

    public void setU_status(String u_status) {
        this.u_status = u_status;
    }

   
   
    
}
