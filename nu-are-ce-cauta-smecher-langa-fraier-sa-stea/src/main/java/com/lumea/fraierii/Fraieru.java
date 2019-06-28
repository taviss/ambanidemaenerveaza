package com.lumea.fraierii;

import com.lumea.Omu;
import com.lumea.banetu.Bani;
import com.lumea.smecherii.Golanu;
import com.lumea.smecherii.Smecherasu;
import com.lumea.smecherii.SmecheruDeCartier;

public class Fraieru extends Omu {
    public Fraieru(String prenume, String nume, Integer varsta) {
        super(prenume, nume, varsta, Bani.BANI_PUTINI);
    }

    public Fraieru(String prenume, String nume, Integer varsta, Bani bani) {
        super(prenume, nume, varsta, bani);
    }

    @Override
    public void traieste() {
        faCeFaceFraierii();
    }


    @Override
    public void staiLanga(Fraieru fraieru) {
        System.out.println("Cand e fraier langa fraier, ne lasa smecherii fara aer");
    }

    @Override
    public void staiLanga(Saraku altOm) {
        System.out.println("Sa fii fraier si sarak nu e combinatie");
    }

    @Override
    public void staiLanga(Smecherasu smecherasu) {
        System.out.println("Pai asa ceva nu se prea poate, pe fraier il da smecheria pe spate");
    }

    @Override
    public void staiLanga(Golanu altOm) {
        System.out.println("Eu astfel de golanissme nu tolerez");
    }

    @Override
    public void staiLanga(SmecheruDeCartier altOm) {
        System.out.println("Da'ce faci boss");
        altOm.daBaniiBoss(this);
    }

    protected void faCeFaceFraierii() {
        System.out.println("Nimic hahahahaha!!111111unu");
    }

    @Override
    public String toString() {
        return String.format("%s %s", prenume(), nume());
    }
}
