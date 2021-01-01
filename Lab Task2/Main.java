
public class Main {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + "\nSymbol: " + stock1.getSymbol());
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());

        System.out.println();

        Stock stock2 = new Stock("msdn", "Microsoft Developer Network");
        stock2.setCurrentPrice(52.5);
        stock2.setCurrentPrice(55.15);
        System.out.println("Stock name: " + stock2.getName() + "\nSymbol: " + stock2.getSymbol());
        System.out.println("previous price: " + stock2.getPreviousClosingPrice());
        System.out.println("current price: " + stock2.getCurrentPrice());
        System.out.println("Percent changed: " + stock2.getChangePercent());
    }

}