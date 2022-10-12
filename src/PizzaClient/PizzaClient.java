package PizzaClient;

public class PizzaClient {
    public void run() {

        Pizza round = new Pizza (3, new Circle (2.5));

        Pizza rect =  new Pizza (4, new Rectangle (4, 4));

        PizzaDeal pd = new PizzaDeal();

        System.out.println(round + " \nis a better deal than\n" + rect

                + ": " + pd.betterDeal(round, rect));

    }

    public static void main (String[] args) {

        new PizzaClient().run();

    }



}
