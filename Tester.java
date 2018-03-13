public class Tester{
    public static void main(String [] args){
        Company severe = new Company("SevereCo");
        severe.addLocation("Smyrna");
        severe.addLocation("Buckhead");

        for(Location locationObj : severe.ListAllLocations()){
            System.out.println("LOCATION ("+locationObj.getName()+")");
            locationObj.addSnackMachines(5);
            locationObj.addDrinkMachines(3);

            for(SnackMachine smObj : locationObj.ListAllSnackMachines()){
                System.out.println("\tSNACK ("+smObj.getId()+")");
                smObj.addNumberOfShelves(5);

                for(Shelf shelf : smObj.ListAllShelves()){
                    System.out.println("\t\tSHELVES ("+shelf.getName()+")");
                    shelf.addNumberOfCompartments(5);
                    smObj.restock();

                    for(Compartment comp : shelf.ListCompartments()){
                        System.out.println("\t\t\tCOMPARTMENT ("+comp.getName()+")"); 
                        System.out.println("\t\t\t\tPRODUCT ("+(comp.getProduct()).getName()+")");
                    }

                }

            }

        }
         
    }

}           




            // for(DrinkMachine dmObj : locationObj.ListAllDrinkMachines()){
            //     System.out.println("\tDRINK ("+dmObj.getId()+")");
            //     dmObj.addNumberOfShelves(2);

            //     for(Shelf shelf : dmObj.ListAllShelves()){
            //         System.out.println("\t\tSHELVES ("+shelf.getName()+")");
            //         shelf.addNumberOfCompartments(8);

            //         for(Compartment comp : shelf.ListCompartments()){
            //             System.out.println("\t\t\tCOMPARTMENT ("+comp.getName()+")");
            //         }
                    

            //     }
                
            // }

        // }

            //     for(Shelf shelf : smObj.ListAllShelves()){
            //         for(Compartment comp : shelf.ListCompartments()){
                        
            //             System.out.print(shelf.getName()+comp.getName()+" ");
            //             if(comp.getName().equals("5")){
            //                 System.out.println();
            //             }
            //         }
            //     }
            // }
            // for(DrinkMachine dmObj : locationObj.ListAllDrinkMachines()){
            //     System.out.println(dmObj.getId());
            //     for(Shelf shelf : dmObj.ListAllShelves()){
            //         for(Compartment comp : shelf.ListCompartments()){
            //             System.out.print(shelf.getName()+comp.getName()+" ");
            //             if(comp.getName().equals("5")){
            //                 System.out.println();
            //             }
            //         }
            //     }
            // }
        // //}
        // DrinkDistributor cans = new DrinkDistributor("canned");
        // for(Product c : cans.getCannedDrinks()){
        //     System.out.println(c.getName());
        // }
        
        
        // DrinkDistributor bottles = new DrinkDistributor("bottled");
        // for(Product b : bottles.getBottledDrinks()){
        //     System.out.println(b.getName());
        // }
        
        
        // SnackDistributor snacks = new SnackDistributor();
        // for(Product s : snacks.getSnacks()){
        //     System.out.println(s.getName());
        // }

        // System.out.println("-----------------------");
        
        // System.out.println(cans.getCannedDrink(0));
        // System.out.println(bottles.getBottledDrink(0));
        // System.out.println(snacks.getSnack(0));
