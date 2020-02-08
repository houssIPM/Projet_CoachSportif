package metier;
// Generated 2020-2-8 10:16:55 by Hibernate Tools 4.3.1



/**
 * Notifier generated by hbm2java
 */
public class Notifier  implements java.io.Serializable {


     private NotifierId id;
     private User userByIduser;
     private User userByIduserEnvoyer;
     private String message;

    public Notifier() {
    }

	
    public Notifier(NotifierId id, User userByIduser, User userByIduserEnvoyer) {
        this.id = id;
        this.userByIduser = userByIduser;
        this.userByIduserEnvoyer = userByIduserEnvoyer;
    }
    public Notifier(NotifierId id, User userByIduser, User userByIduserEnvoyer, String message) {
       this.id = id;
       this.userByIduser = userByIduser;
       this.userByIduserEnvoyer = userByIduserEnvoyer;
       this.message = message;
    }
   
    public NotifierId getId() {
        return this.id;
    }
    
    public void setId(NotifierId id) {
        this.id = id;
    }
    public User getUserByIduser() {
        return this.userByIduser;
    }
    
    public void setUserByIduser(User userByIduser) {
        this.userByIduser = userByIduser;
    }
    public User getUserByIduserEnvoyer() {
        return this.userByIduserEnvoyer;
    }
    
    public void setUserByIduserEnvoyer(User userByIduserEnvoyer) {
        this.userByIduserEnvoyer = userByIduserEnvoyer;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }




}

