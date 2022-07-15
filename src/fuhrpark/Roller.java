package fuhrpark;

public class Roller extends Fahrzeug{
	private static int anzahlRoller = 0;
	private String farbe;
	private Integer zuladungInKG;
	
	Roller(String fahrzeugTyp, String fahrzeugKennung){
		super(fahrzeugTyp, fahrzeugKennung);
		setAnzahlRoller(getAnzahlRoller() + 1);
	}
	
	Roller(String fahrzeugTyp, String fahrzeugKennung, int zuladungInKG){
		super(fahrzeugTyp, fahrzeugKennung);
		if (zuladungInKG > 0) {
			setZuladungInKG(zuladungInKG);
			}
			else { this.zuladungInKG = 9999;
			}
		
		setAnzahlRoller(getAnzahlRoller() + 1);
	}
	
	Roller(String fahrzeugTyp, String fahrzeugKennung, String farbe, Integer zuladungInKG){
		super(fahrzeugTyp, fahrzeugKennung);
		this.farbe = farbe;
		this.zuladungInKG = zuladungInKG;
		setAnzahlRoller(getAnzahlRoller() + 1);
	}
	
	//Eingabe Scooter, Escooter
	public Roller(String fahrzeugTyp, String fahrzeugKennung, String farbe, int zuladungInKG, double kaufpreis, boolean verfuegbar) {
		super(fahrzeugTyp, fahrzeugKennung, kaufpreis, verfuegbar);
		this.farbe = farbe;
		this.zuladungInKG = zuladungInKG;
		setAnzahlRoller(getAnzahlRoller() + 1);
	}
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public Integer getZuladungInKG() {
		return zuladungInKG;
	}
	public void setZuladungInKG(Integer zuladungInKG) {
		this.zuladungInKG = zuladungInKG;
	}

	public static int getAnzahlRoller() {
		return anzahlRoller;
	}

	public static void setAnzahlRoller(int anzahlRoller) {
		Roller.anzahlRoller = anzahlRoller;
	}
	
	

}
