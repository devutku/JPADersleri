package entity;

public class CheapProduct {
    private int prodId;
    private String prodName;
    private double prodPrice;

    public CheapProduct(int prodId, String prodName, double prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdId() {
        return prodId;
    }

    @Override
    public String toString() {
        return "CheapProduct{" +
                "prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }

}
