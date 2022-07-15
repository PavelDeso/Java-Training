package fuhrpark;
import java.util.Date;


public class Fahrzeug {

	private static int anzahlFahrzeug = 0;
	public static Date kaufDatum;
	private String fahrzeugTyp;
	private String fahrzeugkennung;
	private double kaufpreis;
	private boolean verfuegbar;
    private String verfuegbarDeutsch;
	
	Fahrzeug(String fahrzeugTyp, String fahrzeugKennung){
		this.fahrzeugTyp = fahrzeugTyp;
		this.fahrzeugkennung = fahrzeugKennung;
		Fahrzeug.kaufDatum = new Date();
		kaufpreis = 666.0;
		verfuegbar = true;
		setAnzahlFahrzeug(getAnzahlFahrzeug() + 1);
	}
	
	Fahrzeug(String fahrzeugTyp, String fahrzeugKennung, double kaufpreis){
		this.fahrzeugTyp = fahrzeugTyp;
		this.fahrzeugkennung = fahrzeugKennung;
		this.kaufpreis = kaufpreis;
		verfuegbar = true;
		setAnzahlFahrzeug(getAnzahlFahrzeug() + 1);
	}
	
	Fahrzeug(String fahrzeugTyp, String fahrzeugKennung, double kaufpreis, boolean verfuegbar){
		this.fahrzeugTyp = fahrzeugTyp;
		this.fahrzeugkennung = fahrzeugKennung;
		this.kaufpreis = kaufpreis;
		this.verfuegbar = verfuegbar;
		setAnzahlFahrzeug(getAnzahlFahrzeug() + 1);
	}
	
	static long getKaufDatum(){
		return kaufDatum.getTime();
	}
	void setKaufDatum(Date kaufDatum){
		Fahrzeug.kaufDatum = kaufDatum;
	}
	public String getFahrzeugkennung() {
		return fahrzeugkennung;
	}
	public void setFahrzeugkennung(String fahrzeugkennung) {
		this.fahrzeugkennung = fahrzeugkennung;
	}
	public double getKaufpreis() {
		return kaufpreis;
	}
	public void setKaufpreis(double kaufpreis) {
		if(kaufpreis > 0) {
		this.kaufpreis = kaufpreis;
		}
	}
	public boolean getVerfuegbar() {
		return isVerfuegbar();
	}
	public boolean isVerfuegbar() {
		return verfuegbar;
	}
	public void setVerfuegbar(boolean verfuegbar) {
		this.verfuegbar = verfuegbar;
	}
	
	public String getFahrzeugTyp() {
		return fahrzeugTyp;
	}

	public void setFahrzeugTyp(String fahrzeugTyp) {
		this.fahrzeugTyp = fahrzeugTyp;
	}
	
	public String ausgabeVerfuegbarDeutsch(boolean verfuegbar) {
		if (verfuegbar == true) {
			verfuegbarDeutsch = "Ja";
		}
		else {verfuegbarDeutsch = "Nein";
		
		}
		return verfuegbarDeutsch;
	}

	public static int getAnzahlFahrzeug() {
		return anzahlFahrzeug;
	}

	public static void setAnzahlFahrzeug(int anzahlFahrzeug) {
		Fahrzeug.anzahlFahrzeug = anzahlFahrzeug;
	}
	
	
	
	
}
