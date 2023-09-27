package Tipos;

import java.math.BigDecimal;

public class Price {
    private BigDecimal amount;

    public Price(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
