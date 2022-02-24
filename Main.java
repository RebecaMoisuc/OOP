package ro.ItSchool.incapsulation.stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Amz", "Amazon");
        stock.setClosingPrice(50);
        stock.setCurrentPrice(50.5);

        System.out.printf("Price change percentage: %.2f", stock.getChangePercent());


    }
}
