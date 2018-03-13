import java.util.ArrayList;

public class Compartment{
    private String name;
    private ArrayList<Product> productList = new ArrayList<Product>();
    private Product product;
    private int size;


    public Compartment(String name){
        this.name = name;
    }

    // public void setCompartmentSize(int size){
    //     this.size = size;
    // }


    public void setSize(int size){
        this.size = size;
    }


    public void addProduct(Product p){
        this.product = p;
        for(int i = 0; i < this.size; i++){
            (this.productList).add(p);
        }  
    }

    public Product getProduct(){
        return this.product;
    }
    

    public String getName(){
        return this.name;
    }

}