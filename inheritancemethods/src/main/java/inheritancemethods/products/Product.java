package inheritancemethods.products;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal unitWeight; // 88.05kg
    private int numberOfDecimals = 2; // kerekítés

    public Product(String name, BigDecimal unitWeigth, int numberOfDecimals){
        this.name = name;
        this.unitWeight = unitWeigth;
        this.numberOfDecimals = numberOfDecimals;
    }
    public Product(String name, BigDecimal unitWeigth){
        this.name = name;
        this.unitWeight = unitWeigth;
    }

    public BigDecimal totalWeight(int pieces){
        return new BigDecimal(Integer.toString(pieces)).multiply(getUnitWeight()).setScale(getNumberOfDecimals(),BigDecimal.ROUND_HALF_UP);
    }


    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }
}
