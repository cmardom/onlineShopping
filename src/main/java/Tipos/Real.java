package Tipos;

import java.math.BigDecimal;

public class Real {
    private BigDecimal amount;

    public Real(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
