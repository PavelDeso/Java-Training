package fuhrpark;
public class VerbrennerPKW extends PKW {
    private static Integer anzahlVerbrennerPKW = 0;
    private String treibstoff;
    private Integer fuellstand;
    
    VerbrennerPKW(String fahrzeugTyp, String fahrzeugKennung){
    	super(fahrzeugTyp, fahrzeugKennung);
    	anzahlVerbrennerPKW++;
    	
    }
    
	VerbrennerPKW(String fahrzeugTyp, String fahrzeugKennung, double kaufpreis, boolean verfuegbar,  int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String farbe, String treibstoff, int fuellstand){
        super(fahrzeugTyp, fahrzeugKennung, kaufpreis, verfuegbar, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen, farbe);
        this.treibstoff = treibstoff;       
        this.fuellstand = fuellstand;
        anzahlVerbrennerPKW++;
    }
	
    
	public static Integer getAnzahlVerbrennerPKW() {
        return anzahlVerbrennerPKW;
    }
    public void setAnzahlVerbrennerPKW(Integer anzahlVerbrennerPKW) {
        VerbrennerPKW.anzahlVerbrennerPKW = anzahlVerbrennerPKW;
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