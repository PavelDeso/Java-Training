package fuhrpark;
public class ElektroPKW extends PKW {
    private Integer anzahlElektroPKW;
    private Integer akkuKapazitaet;
    private Integer ladestand;
   
    ElektroPKW(String fahrzeugKennung){
    	super(fahrzeugKennung);
    }
       
    ElektroPKW(String fahrzeugKennung, int anzahlMaxInsassen, int ladestand){
    	super(fahrzeugKennung, anzahlMaxInsassen);
    	this.ladestand = ladestand;
    }
 	
    ElektroPKW(String fahrzeugKennung, int anzahlMaxInsassen,int anzahlTueren, int ladestand){
    	super(fahrzeugKennung, anzahlMaxInsassen, anzahlTueren);
    	this.ladestand = ladestand;
    }
   
    
    public Integer getAnzahlElektroPKW() {
        return anzahlElektroPKW;
    }
    public void setAnzahlElektroPKW(Integer anzahlElektroPKW) {
        this.anzahlElektroPKW = anzahlElektroPKW;
    }
    public Integer getAkkuKapazitaet() {
        return akkuKapazitaet;
    }
    public void setAkkuKapazitaet(Integer akkuKapazitaet) {
        this.akkuKapazitaet = akkuKapazitaet;
    }
    public Integer getLadestand() {
        return ladestand;
    }
    public void setLadestand(Integer ladestand) {
        this.ladestand = ladestand;
    }
}