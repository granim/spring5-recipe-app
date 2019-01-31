package guru.springframework.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class UnitOfMeasure {

    BigDecimal cups;
    BigDecimal Tb;
    BigDecimal tsp;

    public BigDecimal getCups() {
        return cups;
    }

    public void setCups(BigDecimal cups) {
        this.cups = cups;
    }

    public BigDecimal getTb() {
        return Tb;
    }

    public void setTb(BigDecimal tb) {
        Tb = tb;
    }

    public BigDecimal getTsp() {
        return tsp;
    }

    public void setTsp(BigDecimal tsp) {
        this.tsp = tsp;
    }
}
