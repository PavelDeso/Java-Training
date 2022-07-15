package fuhrpark;
public class LKW  extends Fahrzeug{
	private static int anzahlLKW = 0;
	private String kfzKennzeichen;
    private double zulaessigesGesamtgewicht;
    private double ladeVolume;
    private boolean gefahrengut;
    private boolean kuehlung;
    private String kuehlungDeutsch;
    private String farbe;
    
    LKW(String fahrzeugTyp, String fahrzeugKennung, double kaufpreis, boolean verfuegbar, double zulaessigesGesamtgewicht, double ladeVolume, boolean gefahrengut, boolean kuehlung, String kfzKennzeichen, String farbe){
    	super(fahrzeugTyp, fahrzeugKennung, kaufpreis, verfuegbar);
    	this.zulaessigesGesamtgewicht = zulaessigesGesamtgewicht;
    	this.ladeVolume = ladeVolume;
    	this.gefahrengut = gefahrengut;
    	this.kuehlung = kuehlung;
    	this.kfzKennzeichen = kfzKennzeichen;
    	this.farbe = farbe;
    	setAnzahlLKW(getAnzahlLKW() + 1);
    }
    
    
    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }
    public void setKfzKennzeichen(String kfzKennzeichen) {
        this.kfzKennzeichen = kfzKennzeichen;
    }
    public double getZulaessigesGesamtgewicht() {
        return zulaessigesGesamtgewicht;
    }
    public void setZulaessigesGesamtgewicht(double zulaessigesGesamtgewicht) {
        this.zulaessigesGesamtgewicht = zulaessigesGesamtgewicht;
    }
    public double getLadeVolume() {
        return ladeVolume;
    }
    public void setLadeVolume(double ladeVolume) {
        this.ladeVolume = ladeVolume;
    }
    public boolean isGefahrengut() {
        return gefahrengut;
    }
    public void setGefahrengut(boolean gefahrengut) {
        this.gefahrengut = gefahrengut;
    }
    public boolean isKuehlung() {
        return kuehlung;
    }
    public void setKuehlung(boolean kuehlung) {
        this.kuehlung = kuehlung;
    }


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String ausgabeKuehlungDeutsch(boolean kuehlung) {
		if (kuehlung == true) {
			kuehlungDeutsch = "Ja";
		}
		else {kuehlungDeutsch = "Nein";
		
		}
		return kuehlungDeutsch;
	}


	public static int getAnzahlLKW() {
		return anzahlLKW;
	}


	public static void setAnzahlLKW(int anzahlLKW) {
		LKW.anzahlLKW = anzahlLKW;
	}
	
}