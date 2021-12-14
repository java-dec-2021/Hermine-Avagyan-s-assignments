public class Mammal {
    //    protected String name;
        protected int energyLevel;
        public Mammal(){
    
        }
    
        public Mammal(int energyLevel) {
            this.energyLevel = 100;
        }
    
        public int displayEnergy(){
            System.out.println("The mammal's energy level is " + energyLevel);
            return this.energyLevel;
        }
    }
    
    