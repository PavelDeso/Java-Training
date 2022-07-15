package fuhrpark;
public class ElektroPKW extends PKW {
    private static Integer anzahlElektroPKW = 0;
    private double akkuKapazitaet;
    private Integer ladestand;

   
    ElektroPKW(String fahrzeugTyp, String fahrzeugKennung){
    	super(fahrzeugTyp, fahrzeugKennung);
    }
       
    ElektroPKW(String fahrzeugTyp, String fahrzeugKennung, double kaufpreis, boolean verfuegbar,  int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String farbe, double akkuKapazitaet, int ladestand){
        super(fahrzeugTyp, fahrzeugKennung, kaufpreis, verfuegbar, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen, farbe);
        this.akkuKapazitaet = akkuKapazitaet;       
        this.ladestand = ladestand;
        anzahlElektroPKW++;
    }
   
    
    public static Integer getAnzahlElektroPKW() {
        return anzahlElektroPKW;
    }
    public void setAnzahlElektroPKW(Integer anzahlElektroPKW) {
        ElektroPKW.anzahlElektroPKW = anzahlElektroPKW;
    }
    public double getAkkuKapazitaet() {
        return akkuKapazitaet;
    }
    public void setAkkuKapazitaet(double akkuKapazitaet) {
        this.akkuKapazitaet = akkuKapazitaet;
    }
    public Integer getLadestand() {
        return ladestand;
    }
    public void setLadestand(Integer ladestand) {
        this.ladestand = ladestand;
    }
    
}