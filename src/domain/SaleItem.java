package domain;

import java.math.BigDecimal;

/**
 * @author Elijah Zolduoarrati
 * @Description
 * @date
 **/
public class SaleItem {
    private BigDecimal quantityPurchased;
    private BigDecimal purchasedPrice;

    public BigDecimal getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(BigDecimal quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public BigDecimal getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(BigDecimal purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "quantityPurchased=" + quantityPurchased +
                ", purchasedPrice=" + purchasedPrice +
                '}';
    }
}
