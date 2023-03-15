public class Lkw extends Fahrzeug{
    // --- Konstruktor ---
    public Lkw(String ladung, int geschwindigkeit){
        super(geschwindigkeit);
        this.Ladung = ladung;
        System.out.println("Konstruktor LKW");
    }
    // --- Attribute ---
    private String Ladung;
    // --- Methoden ---
    // --- Getter ---
    public String getLadung() {
        return Ladung;
    }
    // --- Setter ---
    public void setLadung(String ladung) {
        Ladung = ladung;
    }
    // --- ToString ---


    public String toString() {
        return "Lkw{" +
                "Ladung='" + Ladung + '\'' +
                ", geschwindigkeit=" + geschwindigkeit +
                "} ";
    }
}