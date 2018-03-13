import java.util.ArrayList;
public class Company{
    //state
    private String name;
    //Manage an array list of Locations
    private ArrayList<Location> locList = new ArrayList<Location>();
    //constructor
    public Company(String name){
        this.name = name;

    }
    public void addLocation(String name){
        locList.add(new Location(name));
    }    

    public ArrayList<Location> ListAllLocations(){
        return this.locList;

    }

}




