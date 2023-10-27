import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int goal = 0;
        for(int i = 1; i<=numWeeks; i++){
            goal +=i;
        }
        return goal;
    }
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }
    public boolean displayMenu(ArrayList<String> menuItems){
        for(int i=0; i< menuItems.size(); i++){
            System.out.println(String.format("%d %s",i,menuItems.get(i)));
        }
        return true;
    }
    public void addCustomer(ArrayList<String> customers){
        boolean continueEntering = true;
        while(continueEntering){
            System.out.println("\nPlease enter customer name (enter q to quit):");
            String username = System.console().readLine();
            if(username.toUpperCase().equals("Q")) {
                continueEntering = false;
            } else {
                System.out.println("Hello, "+username);
                System.out.printf("There %s %d %s in front of you.", customers.size()==1 ? "is" : "are",customers.size(), customers.size()==1 ? "person" : "people");
                customers.add(username);
                System.out.println(customers);
            }
        }
    }
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for (int i = 1 ; i <= maxQuantity;i++){
            System.out.printf(" %d - %.2f\n",i,price*i-(i-1)*.5);
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()) return false;
        for(int i=0; i < menuItems.size(); i++){
            System.out.println(" " + i + " " + menuItems.get(i) + " -- " + String.format("$%.2f", prices.get(i)));
        }
        return true;
    }

}
