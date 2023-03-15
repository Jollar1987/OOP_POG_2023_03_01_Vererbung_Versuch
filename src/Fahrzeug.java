abstract class Fahrzeug {
    public Fahrzeug(int geschwindigkeit){
        this.geschwindigkeit=geschwindigkeit;
        System.out.println("Konstruktor Fahrzeug");
    }
    // --- Attribute ---

    protected int geschwindigkeit;

    // --- Methoden ---
    // --- Getter ---
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    // --- Setter ---
    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
}