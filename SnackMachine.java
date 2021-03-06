import java.util.ArrayList;
public class SnackMachine{

    private String id;
    private ArrayList<Shelf> shelfList= new ArrayList<Shelf>();
    private RandomStuffMaker lazily = new RandomStuffMaker();

    private SnackDistributor sD = new SnackDistributor();
    private ArrayList<Product> sDList = sD.getSnacks();

    

    public SnackMachine(String id){
        this.id = id;
        // setNumberOfShelves(5);
    }

    public String getId(){
        return this.id;
    }

    public void addNumberOfShelves(int shelves){
        for(int i = 0; i < shelves; i++){
            String alphabetId = lazily.getCurrentCharacter();
            lazily.setNextOrderedAlphabeticalCharacter();
            (this.shelfList).add(new Shelf(alphabetId));
        }  
    }

    public ArrayList<Shelf> ListAllShelves(){
        return this.shelfList;
    }

    public void restock(){
        int i = 0;
        for(Shelf shelf : this.shelfList){
            for(Compartment compartment : shelf.ListCompartments()){
                compartment.setSize(10);
                compartment.addProduct(sDList.get(i));
                i++;
            }
        }
    }
    
    public String toStringShelves(){
        String str = "";
        for(Shelf sh : this.shelfList){
            str += sh.getName();
        }
        str += "\n";
        return str;
    }

}
