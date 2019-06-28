package com.lumea.smecherii;

import com.lumea.Omu;
import com.lumea.banetu.Bani;
import com.lumea.fraierii.Fraieru;
import com.lumea.fraierii.Saraku;

public class Smecherasu extends Omu {

    /** Nu duce calculatoru' cata valoare are omu' */
    private Long valoare = Long.MAX_VALUE;

    private String alias;

    public Smecherasu(String prenume, String alias, String nume, Integer varsta) {
        super(prenume, nume, varsta, Bani.BANI_DE_MA_ENERVEAZA);
        this.alias = alias;
    }

    public Smecherasu(String prenume, String alias, String nume, Integer varsta, Bani bani) {
        super(prenume, nume, varsta, bani);
        this.alias = alias;
    }

    @Override
    public void traieste() {
        bagaSmecheria();
        smecheresteFraieru();
        dezgheataFraieru();
        bagaSmecheria();
    }

    @Override
    public void staiLanga(Smecherasu altOm) {
        System.out.println("Cand e frate langa frate, se da lumea la o parte");
    }

    @Override
    public void staiLanga(Golanu altOm) {
        System.out.println("Asculta bine ce spun\n" +
                "Si fii atent cu cine mergi pe drum\n" +
                "Nu dezgheta fraieru'\n" +
                "Ca iti ia si aeru'. \n" +
                "Ca tu mereu l-ai ajutat, \n" +
                "Incearca sa-ti dea la cap.");
    }

    @Override
    public void staiLanga(SmecheruDeCartier altOm) {
        System.out.println("Bai, tinere, mai fumeaza");
    }

    @Override
    public void staiLanga(Fraieru altOm) {
        System.out.println("Nu are ce cauta, \n" +
                "Smecher cu fraier sa stea. \n" +
                "NU cade bine deloc, \n" +
                "Amandoi pe acelasi loc.");
    }

    @Override
    public void staiLanga(Saraku altOm) {
        System.out.println("Nu are ce cauta, \n" +
                "Smecher cu sarak sa stea. \n" +
                "NU cade bine deloc, \n" +
                "Amandoi pe acelasi loc.");
    }

    public void bagaSmecheria() {
        System.out.println("Smecherii se cunosc, nu se inventeaza");
    }

    public void smecheresteFraieru() {
        System.out.println("Nu e bine niciodata sa smecheresti fraieru'. \n" +
                "Ii umbli un pic la minte si vrea sa-ti ia aeru'. \n" +
                "Nu-i bine sa-i dai valoare, nici macar atentie. \n" +
                "Ca ajunge de se ridica cu mare pretentie.");
    }

    public void dezgheataFraieru() {
        System.out.println("E cea mai mare greseala, fraieru' sa-l dezgheti. \n" +
                "Ii dai aripi si apoi prinde ca pisica 9 vieti. \n" +
                "Cand in scoti in lumea bune prinde smecheriile. \n" +
                "Si cand te are la mana uita ca ai gradele.");
    }

    @Override
    public String toString() {
        return String.format("Eu sunt %s %s %s si la fraeri dau capace", prenume(), alias, nume());
    }
}
