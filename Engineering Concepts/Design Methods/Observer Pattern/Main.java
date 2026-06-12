public class Main
{
    public static void main(String args[])
    {
        StockMarket stockMarket=new StockMarket();

        Observer mobile=new MobileApp(stockMarket);
        Observer web=new WebApp(stockMarket);

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStockPrice(3500);

        System.out.println();

        stockMarket.setStockPrice(3600);

        System.out.println();

        stockMarket.deregisterObserver(web);
        stockMarket.setStockPrice(3700);

        System.out.println();

        stockMarket.deregisterObserver(mobile);
        stockMarket.setStockPrice(3800);

        System.out.println();
    }
}