package fuhrpark;
public class VerbrennerPKW extends PKW {
    private Integer anzahlVerbrennerPKW;
    private String treibstoff;
    private Integer fuellstand;
    
    VerbrennerPKW(String fahrzeugKennung){
    	super(fahrzeugKennung);
    	this.anzahlVerbrennerPKW++;
    	
    }
    
    VerbrennerPKW(String fahrzeugKennung, int anzahlMaxInsassen){
    	super(fahrzeugKennung, anzahlMaxInsassen);
    	this.anzahlVerbrennerPKW++;
    }
    
	VerbrennerPKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren){
		super(fahrzeugKennung, anzahlMaxInsassen, anzahlTueren);
		this.anzahlVerbrennerPKW++;
	}
	
	VerbrennerPKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen){
		super(fahrzeugKennung, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen);
		this.anzahlVerbrennerPKW++;
	}
	
	VerbrennerPKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, int treibstoff){
        super(fahrzeugKennung, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen);
        this.treibstoff = treibstoff;       
    }
    
	VerbrennerPKW(String fahrzeugKennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, int fuellstand){
        super(fahrzeugKennung, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen);
        this.treibstoff = treibstoff;       
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