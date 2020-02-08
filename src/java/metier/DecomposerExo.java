package metier;
// Generated 2020-2-8 10:16:55 by Hibernate Tools 4.3.1



/**
 * DecomposerExo generated by hbm2java
 */
public class DecomposerExo  implements java.io.Serializable {


     private DecomposerExoId id;
     private Circuit circuit;
     private Exercice exercice;
     private Integer ordreexo;

    public DecomposerExo() {
    }

	
    public DecomposerExo(DecomposerExoId id, Circuit circuit, Exercice exercice) {
        this.id = id;
        this.circuit = circuit;
        this.exercice = exercice;
    }
    public DecomposerExo(DecomposerExoId id, Circuit circuit, Exercice exercice, Integer ordreexo) {
       this.id = id;
       this.circuit = circuit;
       this.exercice = exercice;
       this.ordreexo = ordreexo;
    }
   
    public DecomposerExoId getId() {
        return this.id;
    }
    
    public void setId(DecomposerExoId id) {
        this.id = id;
    }
    public Circuit getCircuit() {
        return this.circuit;
    }
    
    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }
    public Exercice getExercice() {
        return this.exercice;
    }
    
    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }
    public Integer getOrdreexo() {
        return this.ordreexo;
    }
    
    public void setOrdreexo(Integer ordreexo) {
        this.ordreexo = ordreexo;
    }




}


