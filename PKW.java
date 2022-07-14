package fuhrpark;
public class PKW extends Fahrzeug {
    private String kfzKennzeichen;
    private Integer anzahlTueren;
    private Integer anzahlMaxInsassen;
      
    PKW(String fahrzeugKennung){
    	super(fahrzeugKennung);
    }
    
    
    PKW(String fahrzeugKennung, int anzahlMaxInsassen){
    	super(fahrzeugKennung);
    	this.anzahlMaxInsassen = anzahlMaxInsassen;
    }
    
    PKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren){
    	super(fahrzeugKennung);
    	this.anzahlMaxInsassen = anzahlMaxInsassen;
    	this.anzahlTueren = anzahlTueren;
    }
    
    PKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen){
    	super(fahrzeugKennung);
    	this.anzahlMaxInsassen = anzahlMaxInsassen;
    	this.anzahlTueren = anzahlTueren;
    	this.kfzKennzeichen = kfzKennzeichen;
    }
    
    
    
    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }
    public void setKfzKennzeichen(String kfzKennzeichen) {
        this.kfzKennzeichen = kfzKennzeichen;
    }
    public Integer getAnzahlTueren() {
        return anzahlTueren;
    }
    public void setAnzahlTueren(Integer anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }
    public Integer getAnzahlMaxInsassen() {
        return anzahlMaxInsassen;
    }
    public void setAnzahlMaxInsassen(Integer anzahlMaxInsassen) {
        this.anzahlMaxInsassen = anzahlMaxInsassen;
    }
}