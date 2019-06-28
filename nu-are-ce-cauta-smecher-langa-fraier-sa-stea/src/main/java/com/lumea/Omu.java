package com.lumea;

import com.lumea.banetu.Bani;
import com.lumea.fraierii.Fraieru;
import com.lumea.fraierii.Saraku;
import com.lumea.smecherii.Golanu;
import com.lumea.smecherii.Smecherasu;
import com.lumea.smecherii.SmecheruDeCartier;

public abstract class Omu {
    private String prenume;
    private String nume;
    private Integer varsta;
    private Bani bani;

    public Omu(String prenume, String nume, Integer varsta, Bani bani) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta = varsta;
        this.bani = bani;
    }

    public abstract void traieste();

    public abstract void staiLanga(Fraieru altOm);

    public abstract void staiLanga(Saraku altOm);

    public abstract void staiLanga(Smecherasu altOm);

    public abstract void staiLanga(Golanu altOm);

    public abstract void staiLanga(SmecheruDeCartier altOm);

    public void scoateBanuLaVedere() {
        System.out.println(String.format("%s %.1f", bani.deCareBani(), bani.catiBani()));
    }

    public Bani banii() {
        return this.bani;
    }

    public void daBaniiBoss(Omu altOm) {
        altOm.bani = Bani.FARA_BANI_DAR_CU_PRIETENI;
        this.bani = Bani.BANI_DE_MA_ENERVEAZA;
    }

    public String prenume() {
        return this.prenume;
    }

    public String nume() {
        return this.nume;
    }
}
