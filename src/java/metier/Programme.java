package metier;
// Generated 2020-2-8 11:12:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Programme generated by hbm2java
 */
public class Programme  implements java.io.Serializable {


     private Integer codep;
     private String nomp;
     private Boolean isstandard;
     private Set affecters = new HashSet(0);
     private Set profils = new HashSet(0);
     private Set seances = new HashSet(0);

    public Programme() {
    }

    public Programme(String nomp, Boolean isstandard, Set affecters, Set profils, Set seances) {
       this.nomp = nomp;
       this.isstandard = isstandard;
       this.affecters = affecters;
       this.profils = profils;
       this.seances = seances;
    }
   
    public Integer getCodep() {
        return this.codep;
    }
    
    public void setCodep(Integer codep) {
        this.codep = codep;
    }
    public String getNomp() {
        return this.nomp;
    }
    
    public void setNomp(String nomp) {
        this.nomp = nomp;
    }
    public Boolean getIsstandard() {
        return this.isstandard;
    }
    
    public void setIsstandard(Boolean isstandard) {
        this.isstandard = isstandard;
    }
    public Set getAffecters() {
        return this.affecters;
    }
    
    public void setAffecters(Set affecters) {
        this.affecters = affecters;
    }
    public Set getProfils() {
        return this.profils;
    }
    
    public void setProfils(Set profils) {
        this.profils = profils;
    }
    public Set getSeances() {
        return this.seances;
    }
    
    public void setSeances(Set seances) {
        this.seances = seances;
    }




}


