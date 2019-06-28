package com.lumea.banetu;

import java.math.BigDecimal;

public enum Bani {

    BANI_PUTINI("BANI_PUTINI", BigDecimal.ONE),
    BANI_FACUTI_GREU_DE_SARAKI("BANI_FACUTI_GREU_DE_SARAKI", BigDecimal.TEN),
    BANI_DE_O_CAFEA("BANI_CAFEA", BigDecimal.valueOf(0xCAFE)),
    FARA_BANI_DAR_CU_PRIETENI("FARA_BANI_DAR_CU_PRIETENI_LOL", BigDecimal.ZERO),

    // Delimitam banii sarakilor de banii la smekeri

    BANI_DE_MA_ENERVEAZA("BANI_DE_MA_ENERVEAZA", BigDecimal.valueOf(0xa0100000)),
    BANII_AIA_CASH("BANI_CASH", BigDecimal.valueOf(0xCA555555)),
    BANETU_FULL("BANI_FULL", BigDecimal.valueOf(0xDADADAAA)),
    BANI_DIN_APARAT("BANI_DIN_APARAT", BigDecimal.valueOf(Math.random()));

    private String deCareBani;
    private BigDecimal catiBani;

    Bani(String deCareBani, BigDecimal catiBani) {
        this.deCareBani = deCareBani;
        this.catiBani = catiBani;
    }

    public String deCareBani() {
        return this.deCareBani;
    }

    public BigDecimal catiBani() {
        return this.catiBani;
    }
}
