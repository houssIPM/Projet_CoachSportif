package metier;
// Generated 2020-2-8 11:12:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer iduser;
     private String loginuser;
     private String passworduser;
     private Set coaches = new HashSet(0);
     private Set notifiersForIduser = new HashSet(0);
     private Set notifiersForIduserEnvoyer = new HashSet(0);
     private Set clients = new HashSet(0);

    public User() {
    }

    public User(String loginuser, String passworduser, Set coaches, Set notifiersForIduser, Set notifiersForIduserEnvoyer, Set clients) {
       this.loginuser = loginuser;
       this.passworduser = passworduser;
       this.coaches = coaches;
       this.notifiersForIduser = notifiersForIduser;
       this.notifiersForIduserEnvoyer = notifiersForIduserEnvoyer;
       this.clients = clients;
    }
   
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    public String getLoginuser() {
        return this.loginuser;
    }
    
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
    public String getPassworduser() {
        return this.passworduser;
    }
    
    public void setPassworduser(String passworduser) {
        this.passworduser = passworduser;
    }
    public Set getCoaches() {
        return this.coaches;
    }
    
    public void setCoaches(Set coaches) {
        this.coaches = coaches;
    }
    public Set getNotifiersForIduser() {
        return this.notifiersForIduser;
    }
    
    public void setNotifiersForIduser(Set notifiersForIduser) {
        this.notifiersForIduser = notifiersForIduser;
    }
    public Set getNotifiersForIduserEnvoyer() {
        return this.notifiersForIduserEnvoyer;
    }
    
    public void setNotifiersForIduserEnvoyer(Set notifiersForIduserEnvoyer) {
        this.notifiersForIduserEnvoyer = notifiersForIduserEnvoyer;
    }
    public Set getClients() {
        return this.clients;
    }
    
    public void setClients(Set clients) {
        this.clients = clients;
    }




}


