class GoblinArcher extends Goblin {
    protected int range;

    public GoblinArcher() {
        this.range = 20;
    }
    
    public GoblinArcher(String name, int health, int attack, int defense, int agility, int range) {
        super (name, health, attack, defense, agility); 
        this.range = range;
    }

    public int getRange() {
        return range;
    }
    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public void attack() {
        System.out.println("Гоблин-Лучник стреляет из лука");
    }

    @Override
    public String toString() {
        return super.toString() + "Дальность стрельбы: " + range + "\n";
    }
}