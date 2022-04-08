/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizsgaKonzol;

/**
 *
 * @author szabo.gergo
 */
public abstract class Karakter {
    private String nev, faj;
    private Eszkoz eszkoz;

    public Karakter(String nev, String faj) {
        this.nev = nev;
        this.faj = faj;
    }
}
