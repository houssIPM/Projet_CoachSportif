package metier;
// Generated 2020-2-8 11:12:39 by Hibernate Tools 4.3.1



/**
 * Executerexo generated by hbm2java
 */
public class Executerexo  implements java.io.Serializable {


     private ExecuterexoId id;
     private Client client;
     private Difficulte difficulte;
     private Exercice exercice;
     private Occurences occurences;
     private Integer duree;
     private Integer serie;
     private Integer repetitionexo;
     private Double distance;
     private Integer ordre;
     private Double dureedem;
     private Integer seriedem;
     private Integer repdem;
     private Double distdem;

    public Executerexo() {
    }

	
    public Executerexo(ExecuterexoId id, Client client, Difficulte difficulte, Exercice exercice, Occurences occurences) {
        this.id = id;
        this.client = client;
        this.difficulte = difficulte;
        this.exercice = exercice;
        this.occurences = occurences;
    }
    public Executerexo(ExecuterexoId id, Client client, Difficulte difficulte, Exercice exercice, Occurences occurences, Integer duree, Integer serie, Integer repetitionexo, Double distance, Integer ordre, Double dureedem, Integer seriedem, Integer repdem, Double distdem) {
       this.id = id;
       this.client = client;
       this.difficulte = difficulte;
       this.exercice = exercice;
       this.occurences = occurences;
       this.duree = duree;
       this.serie = serie;
       this.repetitionexo = repetitionexo;
       this.distance = distance;
       this.ordre = ordre;
       this.dureedem = dureedem;
       this.seriedem = seriedem;
       this.repdem = repdem;
       this.distdem = distdem;
    }
   
    public ExecuterexoId getId() {
        return this.id;
    }
    
    public void setId(ExecuterexoId id) {
        this.id = id;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Difficulte getDifficulte() {
        return this.difficulte;
    }
    
    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }
    public Exercice getExercice() {
        return this.exercice;
    }
    
    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }
    public Occurences getOccurences() {
        return this.occurences;
    }
    
    public void setOccurences(Occurences occurences) {
        this.occurences = occurences;
    }
    public Integer getDuree() {
        return this.duree;
    }
    
    public void setDuree(Integer duree) {
        this.duree = duree;
    }
    public Integer getSerie() {
        return this.serie;
    }
    
    public void setSerie(Integer serie) {
        this.serie = serie;
    }
    public Integer getRepetitionexo() {
        return this.repetitionexo;
    }
    
    public void setRepetitionexo(Integer repetitionexo) {
        this.repetitionexo = repetitionexo;
    }
    public Double getDistance() {
        return this.distance;
    }
    
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    public Integer getOrdre() {
        return this.ordre;
    }
    
    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }
    public Double getDureedem() {
        return this.dureedem;
    }
    
    public void setDureedem(Double dureedem) {
        this.dureedem = dureedem;
    }
    public Integer getSeriedem() {
        return this.seriedem;
    }
    
    public void setSeriedem(Integer seriedem) {
        this.seriedem = seriedem;
    }
    public Integer getRepdem() {
        return this.repdem;
    }
    
    public void setRepdem(Integer repdem) {
        this.repdem = repdem;
    }
    public Double getDistdem() {
        return this.distdem;
    }
    
    public void setDistdem(Double distdem) {
        this.distdem = distdem;
    }




}


