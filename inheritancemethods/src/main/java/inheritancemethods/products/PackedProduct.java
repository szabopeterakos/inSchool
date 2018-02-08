package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox){
    super(name,unitWeight,numberOfDecimals);
    this.packingUnit = packingUnit;
    this.weightOfBox = weightOfBox;
    }

    @Override
    // "6.025" // két doboz meg 15 db
    public BigDecimal totalWeight(int pieces){
        BigDecimal total = new BigDecimal("0");
        BigDecimal piecesWithoutBox = new BigDecimal(Integer.toString(pieces)).multiply(super.getUnitWeight());

        //BOXES???
        int needBox =0;
        while(pieces > 0){
            pieces = pieces - getPackingUnit();
            needBox++;
        }

        total = piecesWithoutBox.add(getWeightOfBox().multiply(new BigDecimal(Integer.toString(needBox))));

        return total;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }
}
