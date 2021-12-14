public class Bat extends Mammal {
    public Bat() {
        this.setEnergyLevel(300);
    }
    //prints the sound a bat taking off and decreases its energy by 50.
    public void fly(){
        System.out.println("The bat is taking off");
        this.setEnergyLevel(getEnergyLevel() - 50);
    }
    //method prints something and increases its energy by 25.
    public void eatHumans(){
        System.out.println("The bat has eaten a human");
        this.setEnergyLevel(getEnergyLevel() +25);
    }
    // method prints something and decreases its energy by 100.
    public void attackTown(){
        System.out.println("The town is on fire");
        this.setEnergyLevel(getEnergyLevel() - 100);
    }
}
