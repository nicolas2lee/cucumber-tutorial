package tao.impl;

import java.math.BigDecimal;

/**
 * Created by xinrui on 30/10/2017.
 */
public class Amount {
    private String currency;
    private BigDecimal value;

    public Amount(String currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Amount add(Amount x){
        this.value = this.value.add(x.getValue());
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        if (!currency.equals(amount.currency)) return false;
        return value.equals(amount.value);
    }

    @Override
    public int hashCode() {
        int result = currency.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }
}
