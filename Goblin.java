class Goblin extends Monster {
    protected int agility;

    public Goblin() {
        this.agility = 5;
    }

    public Goblin(String name, int health, int attack, int defense, int agility) {
        super(name, health, attack, defense, agility); 
        this.agility = agility;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public void attack() {  
        System.out.println("Гоблин атакует мечом");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ловкость: " + agility + "\n";
    }
}