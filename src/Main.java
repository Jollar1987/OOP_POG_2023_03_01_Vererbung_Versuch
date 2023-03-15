public class Main {
    public static void main(String[] args) {
        /*
        Vererbung von oben nach unten immer Spezialisierung (genauer)
        von unten nach oben generalisiert (allgemeiner)
         */
        Pkw pkw = new Pkw(4,120);
        Lkw lkw = new Lkw("Sand",100);
        System.out.println(lkw.toString());
        System.out.println(pkw.toString());
        System.out.println(lkw.geschwindigkeit);
    }
}