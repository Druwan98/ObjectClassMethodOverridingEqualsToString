package Lessons.Exercise.ObjectClassMethodOverridingEqualsToString;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    String priceType;
    double priceInEuros;
    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SmartphonePrice{");
        sb.append("priceType='").append(priceType).append('\'');
        sb.append(", priceInEuros=").append(priceInEuros);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartphonePrice that)) return false;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

}
