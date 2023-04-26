package day30_inheritance.cryptoTask;

public class Ethereum extends CryptoToken{

    public Ethereum(double price, double volume, double marketCap, int quantity, String circulatingSupply, boolean isMineable) {
        super(price, volume, marketCap, quantity, circulatingSupply, isMineable);
    }

}
