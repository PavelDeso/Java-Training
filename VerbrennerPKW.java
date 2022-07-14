package fuhrpark;
public class VerbrennerPKW extends PKW {
    private Integer anzahlVerbrennerPKW;
    private String treibstoff;
    private Integer fuellstand;
    
    VerbrennerPKW(String fahrzeugKennung){
    	super(fahrzeugKennung);
    }
    
    
    VerbrennerPKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, int fuellstand){
        super(fahrzeugKennung, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen);
        this.fuellstand = fuellstand;       
    }
    
    public Integer getAnzahlVerbrennerPKW() {
        return anzahlVerbrennerPKW;
    }
    public void setAnzahlVerbrennerPKW(Integer anzahlVerbrennerPKW) {
        this.anzahlVerbrennerPKW = anzahlVerbrennerPKW;
    }
    public String getTreibstoff() {
        return treibstoff;
    }
    public void setTreibstoff(String treibstoff) {
        this.treibstoff = treibstoff;
    }
    public Integer getFuellstand() {
        return fuellstand;
    }
    public void setFuellstand(Integer fuellstand) {
        this.fuellstand = fuellstand;
    }
}