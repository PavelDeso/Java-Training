package fuhrpark;
import java.util.Date;


public class Fahrzeug {

	static int anzahlFahrzeug = 0;
	private Date kaufDatum;
	private String fahrzeugkennung;
	private double kaufpreis;
	private boolean verfuegbar;
	
	Fahrzeug(String fahrzeugKennung){
		anzahlFahrzeug++;
		this.fahrzeugkennung = fahrzeugKennung;
		kaufpreis = 2.0;
		verfuegbar = true;
	}
	
	
	Date getKaufDatum(){
		return kaufDatum;
	}
	void setKaufDatum(Date kaufDatum){
		this.kaufDatum = kaufDatum;
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
	// public void isVerfuegbar { getVerfuegbar();}
	
	
	
	
}
