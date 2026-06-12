public class WebApp implements Observer
{
    private StockMarket stockMarket;

    public WebApp(StockMarket stockMarket)
    {
        this.stockMarket=stockMarket;
    }

    public void update()
    {
        System.out.println("Web App: Stock price updated to "+stockMarket.getStockPrice());
    }
}