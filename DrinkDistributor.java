import java.util.ArrayList;

public class DrinkDistributor extends Distributor{
    private ArrayList<Product> productList = new ArrayList<Product>();

    public DrinkDistributor(String type){
        super(type);
    }

    public ArrayList<Product> getBottledDrinks(){
        return super.getBottledDrinks();
    }

    public Product getBottledDrink(int i){
        return super.getBottledDrink(i);
    }

    public ArrayList<Product> getCannedDrinks(){
        return super.getCannedDrinks();
    }

    public Product getCannedDrink(int i){
        return super.getCannedDrink(i);
    }
}



