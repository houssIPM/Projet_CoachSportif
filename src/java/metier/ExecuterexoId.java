package metier;
// Generated 2020-2-8 10:16:55 by Hibernate Tools 4.3.1



/**
 * ExecuterexoId generated by hbm2java
 */
public class ExecuterexoId  implements java.io.Serializable {


     private int codee;
     private int codec;
     private int coded;
     private int codeos;

    public ExecuterexoId() {
    }

    public ExecuterexoId(int codee, int codec, int coded, int codeos) {
       this.codee = codee;
       this.codec = codec;
       this.coded = coded;
       this.codeos = codeos;
    }
   
    public int getCodee() {
        return this.codee;
    }
    
    public void setCodee(int codee) {
        this.codee = codee;
    }
    public int getCodec() {
        return this.codec;
    }
    
    public void setCodec(int codec) {
        this.codec = codec;
    }
    public int getCoded() {
        return this.coded;
    }
    
    public void setCoded(int coded) {
        this.coded = coded;
    }
    public int getCodeos() {
        return this.codeos;
    }
    
    public void setCodeos(int codeos) {
        this.codeos = codeos;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ExecuterexoId) ) return false;
		 ExecuterexoId castOther = ( ExecuterexoId ) other; 
         
		 return (this.getCodee()==castOther.getCodee())
 && (this.getCodec()==castOther.getCodec())
 && (this.getCoded()==castOther.getCoded())
 && (this.getCodeos()==castOther.getCodeos());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodee();
         result = 37 * result + this.getCodec();
         result = 37 * result + this.getCoded();
         result = 37 * result + this.getCodeos();
         return result;
   }   


}

