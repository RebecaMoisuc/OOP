package ro.ItSchool.incapsulation.stock;

public class Stock {

    private String symbol;
    private String stock;
    private double closingPrice;
    private double currentPrice;

    Stock(String symbol, String stock){
        this.symbol = symbol;
        this.stock = stock;
    }

    public void setClosingPrice(double closingPrice){
        this.closingPrice = closingPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    double getChangePercent(){
        return ((currentPrice - closingPrice) / closingPrice) * 100;
    }
}
