package vizsgaKonzol;
public class Harcos extends Karakter{
    private int ero, ugyesseg;

    public Harcos(int ero, int ugyesseg, String nev, String faj) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }
}
