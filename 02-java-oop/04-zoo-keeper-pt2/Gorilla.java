public class Gorilla extends Mammal{


    public void throwSomething(){
        System.out.println("The gorilla has thrown something");
        super.setEnergyLevel(getEnergyLevel()-5);
    }

    public void eatBananas(){
        System.out.println("The gorilla is satisfied");
        super.setEnergyLevel(getEnergyLevel() + 5);
    }
    public void climb(){
        System.out.println("The gorilla has climbed a tree");
        super.setEnergyLevel(getEnergyLevel() - 10);
    }


}
