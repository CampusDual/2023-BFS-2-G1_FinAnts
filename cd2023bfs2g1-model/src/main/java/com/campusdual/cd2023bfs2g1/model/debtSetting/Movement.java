package com.campusdual.cd2023bfs2g1.model.debtSetting;

import java.math.BigDecimal;

public class Movement {
    private BigDecimal amount;
    private String concept;

    public Movement(BigDecimal amount) {
        this.amount = amount;
    }

    public Movement(BigDecimal amount, String concept) {
        this.amount = amount;
        this.concept = concept;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }
}
