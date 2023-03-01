public class StockMarketAdapter implements StockMarketReport{
    private StockMarket stockMarket;

    public StockMarketAdapter(){
        stockMarket = new StockMarket();
    }
    @Override
    public String download() {
        String xml = stockMarket.download();
        return convertToJson(xml);
    }

    public String convertToJson(String xml){
        String json = "";
        System.out.println("Converting XML file to JSON...");
        return json;
    }
}