package com.lumea.smecherii;

import com.lumea.banetu.Bani;
import com.lumea.fraierii.Fraieru;

public class SmecheruDeCartier extends Smecherasu {
    public SmecheruDeCartier(String prenume, String alias, String nume, Integer varsta) {
        super(prenume, alias, nume, varsta, Bani.BANI_DIN_APARAT);
    }

    @Override
    public void staiLanga(Fraieru altOm) {
        System.out.println("Tzaka paka, ce faci cu astia?");
        this.daBaniiBoss(altOm);
    }
}
