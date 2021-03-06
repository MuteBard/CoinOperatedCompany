import java.util.ArrayList;

public class VendingMachine{

    private String id;
    private ArrayList<Shelf> shelfList= new ArrayList<Shelf>();
    private RandomStuffMaker lazily = new RandomStuffMaker();


    public VendingMachine(String id){
        this.id = id;
        // setNumberOfShelves(shelves);
    }

    public String getId(){
        return this.id;
    }

    public void setNumberOfShelves(int shelves){
        for(int i = 0; i < shelves; i++){
            String alphabetId = lazily.getCurrentCharacter();
            lazily.setNextOrderedAlphabeticalCharacter();
            (this.shelfList).add(new Shelf(alphabetId));
        }  
    }

    public ArrayList<Shelf> ListAllShelves(){
        return this.shelfList;
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