package metier;
// Generated 2020-2-8 10:16:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Exercice generated by hbm2java
 */
public class Exercice  implements java.io.Serializable {


     private int codee;
     private String nome;
     private byte[] imagee;
     private String descriptione;
     private Set comprendreExercices = new HashSet(0);
     private Set executerexos = new HashSet(0);
     private Set decomposerExos = new HashSet(0);

    public Exercice() {
    }

	
    public Exercice(int codee) {
        this.codee = codee;
    }
    public Exercice(int codee, String nome, byte[] imagee, String descriptione, Set comprendreExercices, Set executerexos, Set decomposerExos) {
       this.codee = codee;
       this.nome = nome;
       this.imagee = imagee;
       this.descriptione = descriptione;
       this.comprendreExercices = comprendreExercices;
       this.executerexos = executerexos;
       this.decomposerExos = decomposerExos;
    }
   
    public int getCodee() {
        return this.codee;
    }
    
    public void setCodee(int codee) {
        this.codee = codee;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte[] getImagee() {
        return this.imagee;
    }
    
    public void setImagee(byte[] imagee) {
        this.imagee = imagee;
    }
    public String getDescriptione() {
        return this.descriptione;
    }
    
    public void setDescriptione(String descriptione) {
        this.descriptione = descriptione;
    }
    public Set getComprendreExercices() {
        return this.comprendreExercices;
    }
    
    public void setComprendreExercices(Set comprendreExercices) {
        this.comprendreExercices = comprendreExercices;
    }
    public Set getExecuterexos() {
        return this.executerexos;
    }
    
    public void setExecuterexos(Set executerexos) {
        this.executerexos = executerexos;
    }
    public Set getDecomposerExos() {
        return this.decomposerExos;
    }
    
    public void setDecomposerExos(Set decomposerExos) {
        this.decomposerExos = decomposerExos;
    }




}

