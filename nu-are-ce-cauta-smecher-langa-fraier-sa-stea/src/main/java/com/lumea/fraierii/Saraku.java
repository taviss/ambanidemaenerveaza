package com.lumea.fraierii;

import com.lumea.banetu.Bani;
import com.lumea.smecherii.SmecheruDeCartier;

public class Saraku extends Fraieru {
    public Saraku(String prenume, String nume, Integer varsta) {
        super(prenume, nume, varsta, Bani.FARA_BANI_DAR_CU_PRIETENI);
    }

    @Override
    public void staiLanga(SmecheruDeCartier altOm) {
        System.out.println("Ce sa-ti dau ca sunt sarak lipit");
    }

    @Override
    protected void faCeFaceFraierii() {
        System.out.println("N-am bani nici sa trec strada");
    }
}
