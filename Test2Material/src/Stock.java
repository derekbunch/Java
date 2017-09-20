import javax.swing.plaf.nimbus.State;

/**
 * Created by dab137 on 3/7/2016.
 */
public class Stock {
    private String symbol;
    private double sharePrice;

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public Stock(String symbol, double sharePrice) {

        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }

    public String toString(){
        String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
        return str;

    }

    public boolean equals(Stock obj){
        boolean state;
        if(symbol.equals(obj.symbol) && sharePrice==obj.sharePrice)
            state = true;
         else
            state = false;

        return state;
    }

    public Stock copy(){
        Stock copyObject = new Stock(symbol, sharePrice);
        return copyObject;
    }

    public Stock(Stock object2){
        symbol = object2.symbol;
        sharePrice = object2.sharePrice;
    }

}
