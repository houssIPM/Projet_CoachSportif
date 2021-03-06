package metier;
// Generated 2020-2-8 11:12:39 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * NotifierId generated by hbm2java
 */
public class NotifierId  implements java.io.Serializable {


     private int iduser;
     private int iduserEnvoyer;
     private Date datenotif;

    public NotifierId() {
    }

    public NotifierId(int iduser, int iduserEnvoyer, Date datenotif) {
       this.iduser = iduser;
       this.iduserEnvoyer = iduserEnvoyer;
       this.datenotif = datenotif;
    }
   
    public int getIduser() {
        return this.iduser;
    }
    
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    public int getIduserEnvoyer() {
        return this.iduserEnvoyer;
    }
    
    public void setIduserEnvoyer(int iduserEnvoyer) {
        this.iduserEnvoyer = iduserEnvoyer;
    }
    public Date getDatenotif() {
        return this.datenotif;
    }
    
    public void setDatenotif(Date datenotif) {
        this.datenotif = datenotif;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NotifierId) ) return false;
		 NotifierId castOther = ( NotifierId ) other; 
         
		 return (this.getIduser()==castOther.getIduser())
 && (this.getIduserEnvoyer()==castOther.getIduserEnvoyer())
 && ( (this.getDatenotif()==castOther.getDatenotif()) || ( this.getDatenotif()!=null && castOther.getDatenotif()!=null && this.getDatenotif().equals(castOther.getDatenotif()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIduser();
         result = 37 * result + this.getIduserEnvoyer();
         result = 37 * result + ( getDatenotif() == null ? 0 : this.getDatenotif().hashCode() );
         return result;
   }   


}


