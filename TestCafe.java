import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args){
        CafeUtil cafe = new CafeUtil();

        System.out.println("\n----- Streak Goal Test -----");
        int weeks = 9;
        System.out.printf("Purchases needed by week %d: %s \n\n", weeks, cafe.getStreakGoal(weeks));

        System.out.println("----- Order Total Test-----");
        double[] orderPrices = {1.5,2.5,3.5,4.5};
        System.out.printf("Order total: $%s \n\n",cafe.getOrderTotal(orderPrices));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<>(Arrays.asList("drip coffee", "cappuccino","latte","mocha"));
        cafe.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customerList = new ArrayList<>(Arrays.asList("Jen"));
        cafe.addCustomer(customerList);

        System.out.println("\n----- Print Price Chart-----");
        cafe.printPriceChart("Columbian Coffee Grounds", 2, 4);
        
        System.out.println("\n----- Display Menu With Price -----");
        ArrayList<Double> orderPricesList = new ArrayList<Double>();
        for(double d : orderPrices) orderPricesList.add(d);
        cafe.displayMenu(menu, orderPricesList);
    }
}

