public class Pkw extends Fahrzeug {
    // --- Konstruktor ---
    public Pkw(int anzahlSitze, int geschwindigkeit){
        super(geschwindigkeit);
        this.anzahlSitze = anzahlSitze;
        System.out.println("Konstruktor PKW");
    }
    // --- Attribute ---
    private int anzahlSitze;
    // --- Methoden ---
    // --- Getter ---
    public int getAnzahlSitze() {
        return anzahlSitze;
    }
    // --- Setter ---
    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }
    // --- ToString ---

    @Override
    public String toString() {
        return "Pkw: " +
                "Anzahl der Sitze=" + anzahlSitze + " " + geschwindigkeit;
    }
}