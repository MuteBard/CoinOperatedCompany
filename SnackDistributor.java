import java.util.ArrayList;

public class SnackDistributor extends Distributor{
    private ArrayList<Product> productList = new ArrayList<Product>();

    public SnackDistributor(){
        super("snack");
    }

    public ArrayList<Product> getSnacks(){
        return super.getSnacks();
    }

    public Product getSnack(int i){
        return super.getSnack(i);
    }
}