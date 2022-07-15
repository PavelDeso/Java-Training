package fuhrpark;
public class PKW extends Fahrzeug {
	private static int anzahlPKW = 0;
	private Integer anzahlTueren;
    private Integer anzahlMaxInsassen;
    private String kfzKennzeichen;
    private String farbe;
    
    PKW(String fahrzeugTyp, String fahrzeugKennung){
    	super(fahrzeugTyp, fahrzeugKennung);
    	setAnzahlPKW(getAnzahlPKW() + 1);
    }
    
    
    PKW(String fahrzeugTyp, String fahrzeugKennung, double kaufpreis, boolean verfuegbar,  int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String farbe){
    	super(fahrzeugTyp, fahrzeugKennung, kaufpreis, verfuegbar);
    	this.anzahlMaxInsassen = anzahlMaxInsassen;
    	this.anzahlTueren = anzahlTueren;
    	this.kfzKennzeichen = kfzKennzeichen;
    	this.setFarbe(farbe);
    	setAnzahlPKW(getAnzahlPKW() + 1);
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
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public static int getAnzahlPKW() {
		return anzahlPKW;
	}


	public static void setAnzahlPKW(int anzahlPKW) {
		PKW.anzahlPKW = anzahlPKW;
	}
}