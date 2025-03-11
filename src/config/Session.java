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
      private int uid;
    private String u_fname;
    private String u_lname;
    private String u_contact;
    private String u_type;
    private String u_email;
    private String u_un;
   
    private String status;

    
    private Session(){
        //Private cons.prevents instance 
  
    }

    public static synchronized Session getInstance() {
       if(instance == null){
           instance = new Session();
       }
        return instance;
    }

   public static boolean isIntanceEmpty(){
       return instance == null;
   }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
   
   
    
}
