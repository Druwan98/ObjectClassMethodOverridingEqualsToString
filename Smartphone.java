package Lessons.Exercise.ObjectClassMethodOverridingEqualsToString;

import java.util.Objects;

public class Smartphone implements Cloneable {
    String brandName;
    String modelName;
    int batterymAH;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int batterym, SmartphonePrice producerP, SmartphonePrice retailP) {
        this.brandName = brand ;
        this.modelName = model;
        this.batterymAH = batterym;
        this.producerPrice = producerP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Smartphone{");
        sb.append("brandName='").append(brandName).append('\'');
        sb.append(", modelName='").append(modelName).append('\'');
        sb.append(", batterymAH=").append(batterymAH);
        sb.append(", producerPrice=").append(producerPrice);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        return batterymAH == that.batterymAH && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAH, producerPrice, retailPrice);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;
        return clonedSmartphone;
    }


}
