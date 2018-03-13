import java.util.ArrayList;

public class Distributor{
    private ArrayList<Product> productList = new ArrayList<Product>();

    public Distributor(String s){
        if(s.equalsIgnoreCase("bottled")){
            setBottledDrinks();
        }else if(s.equalsIgnoreCase("canned")){
            setCannedDrinks();
        }else if(s.equalsIgnoreCase("snack")){
            setSnacks();
        }
    }

    public void setSnacks(){
        productList.add(new Product("Kit Kat", "Candy", .50, 1.00));
        productList.add(new Product("Reeses", "Candy", .50, 1.00));
        productList.add(new Product("Baby Ruth", "Candy", .50, 1.00));
        productList.add(new Product("Butterfingers", "Candy", .50, 1.00));
        productList.add(new Product("Skittles", "Candy", .50, 1.00));
        productList.add(new Product("Twix", "Candy", .50, 1.00));
        productList.add(new Product("Paydays", "Candy", .50, 1.00));
        productList.add(new Product("Starburst", "Candy", .50, 1.00));
        productList.add(new Product("Milky Way", "Candy", .50, 1.00));
        productList.add(new Product("M & M's", "Candy", .50, 1.00));
        productList.add(new Product("Nacho Cheese Doritos", "Chips", .50, 1.00));
        productList.add(new Product("Spicy Nacho Doritos", "Chips", .50, 1.00));
        productList.add(new Product("Cool Ranch Doritos", "Chips", .50, 1.00));
        productList.add(new Product("Sour Cream & Onion Chips", "Chips", .50, 1.00));
        productList.add(new Product("BBQ Chips", "Chips", .50, 1.00));
        productList.add(new Product("Salt and Vinegar Chips", "Chips", .50, 1.00));
        productList.add(new Product("Fritos", "Chips", .50, 1.00));
        productList.add(new Product("Peanut Butter Crackers", "Crackers", .50, 1.00));
        productList.add(new Product("Cheddar Cheese Crackers", "Crackers", .50, 1.00));
        productList.add(new Product("Butterscotch Krimpets", "Tasty Cakes", .50, 1.00));
        productList.add(new Product("Jelly Krimpets", "Tasty Cakes", .50, 1.00));
        productList.add(new Product("Chocolate Cupcakes", "Tasty Cakes", .50, 1.00));
        productList.add(new Product("Coffee Cakes", "Tasty Cakes", .50, 1.00));
        productList.add(new Product("Kandy Cakes", "Tasty Cakes", .50, 1.00));
        productList.add(new Product("Honey Roasted Peanuts", "Peanuts", .50, 1.00));
    }

    public void setBottledDrinks(){
        productList.add(new Product("Cool Rush Gatorade", "Gatorade", .50, 1.00));
        productList.add(new Product("Glacier Gatorade", "Gatorade", .50, 1.00));
        productList.add(new Product("Orange Gatorade", "Gatorade", .50, 1.00));
        productList.add(new Product("Melon Gatorade", "Gatorade", .50, 1.00));
        productList.add(new Product("Mucho Mango Arizona", "Juice", .50, 1.00));
        productList.add(new Product("Fruit Punch Arizona", "Juice", .50, 1.00));
        productList.add(new Product("Half and Half Arizona", "Juice", .50, 1.00));
        productList.add(new Product("Strawberry Kiwi Mystic", "Juice", .50, 1.00));
        productList.add(new Product("Minute Maid Apple Juice", "Juice", .50, 1.00));
        productList.add(new Product("Water", "Water", .50, 1.00));
    }

    public void setCannedDrinks(){
        productList.add(new Product("Lemonade", "Juice", .50, 1.00));
        productList.add(new Product("Coke", "Soda", .50, 1.00));
        productList.add(new Product("Root Beer", "Soda", .50, 1.00));
        productList.add(new Product("Pepsi", "Soda", .50, 1.00));
        productList.add(new Product("Orange Fanta", "Soda", .50, 1.00));
        productList.add(new Product("Strawberry Fanta", "Soda", .50, 1.00));
        productList.add(new Product("Raspberry Fanta", "Soda", .50, 1.00));
        productList.add(new Product("Mango Fanta", "Soda", .50, 1.00));
        productList.add(new Product("Brisk Ice Tea", "Juice", .50, 1.00));
        productList.add(new Product("Brisk Raspberry Tea", "Juice", .50, 1.00));
        productList.add(new Product("Chocolate Yoo-hoo", "Milk", .50, 1.00));
        productList.add(new Product("Dr. Pepper", "Soda", .50, 1.00));
        productList.add(new Product("Sprite", "Juice", .50, 1.00));
        productList.add(new Product("Dr. Sprite", "Soda", .50, 1.00));
        productList.add(new Product("Hawaiian Fruit Punch", "Juice", .50, 1.00));
        productList.add(new Product("Mountain Dew", "Soda", .50, 1.00));
        productList.add(new Product("Cream Soda", "Soda", .50, 1.00));
        productList.add(new Product("Birch Beer", "Soda", .50, 1.00));

    }

    public ArrayList<Product> getBottledDrinks(){
        return this.productList;
    }

    public Product getBottledDrink(int i){
        return (this.productList).get(i);
    }

    public ArrayList<Product> getCannedDrinks(){
        return this.productList;
    }

    public Product getCannedDrink(int i){
        return (this.productList).get(i);
    }

    public ArrayList<Product> getSnacks(){
        return this.productList;
    }

    public Product getSnack(int i){
        return (this.productList).get(i);
    }
}
