public class Product{
    private String name;
    private String desc;
    private double wholesale;
    private double retail;

    public Product(String name, String desc, double wholesale, double retail){
        this.name = name;
        this.desc = desc;
        this.wholesale = wholesale;
        this.retail = retail;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.desc;
    }
    public double getWholeSale(){
        return this.wholesale;
    }
    public double getRetail(){
        return this.retail;
    }
    public String toString(){
        return 
        "Name: "+this.name+" "+
        "Description: "+this.desc+" "+
        "WholeSale Price: "+this.wholesale+" "+
        "Retail Price: "+this.retail; 
    }

}