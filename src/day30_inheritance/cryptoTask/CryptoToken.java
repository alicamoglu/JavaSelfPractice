package day30_inheritance.cryptoTask;

public class CryptoToken {
    private double price, volume, marketCap;
    private int quantity;
    private String circulatingSupply;
    private boolean isMineable;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.out.println("price can not be zero or less therefore your entry : "+price+" is invalid");
            System.exit(1);
        }
        this.price = price;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getMarketCap() {
        return marketCap;
    }
    public void setMarketCap(double marketCap) {
        System.out.println("quantity can not be zero or less therefore your entry : "+quantity+" is invalid");
        System.exit(1);
        this.marketCap = marketCap;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        System.out.println("quantity can not be zero or less therefore your entry : "+quantity+" is invalid");
        System.exit(1);
        this.quantity = quantity;
    }
    public String getCirculatingSupply() {
        return circulatingSupply;
    }
    public void setCirculatingSupply(String circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }
    public boolean isMineable() {
        return isMineable;
    }
    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public CryptoToken(double price, double volume, double marketCap, int quantity, String circulatingSupply, boolean isMineable) {
        setPrice(price);                  //this.price = price;
        setVolume(volume);                  //this.volume = volume;
        setMarketCap(marketCap);                  //this.marketCap = marketCap;
        setQuantity(quantity);                  //this.quantity = quantity;
        setCirculatingSupply(circulatingSupply);    //this.circulatingSupply = circulatingSupply;
        setMineable(isMineable());                  //this.isMineable = isMineable;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", volume=" + volume +
                ", marketCap=" + marketCap +
                ", quantity=" + quantity +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineable=" + isMineable +
                '}';
    }
}
