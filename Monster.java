abstract class Monster {
    protected String name;
    protected int health;
    protected int attack;
    protected int defense;

    protected static int count = 0;

    public Monster() {
        this.name = "Безымянный монстр";
        this.health = 1;
        this.attack = 1;
        this.defense = 1;
        count++;
    }

    public Monster(String name, int health, int attack, int defense, int additionalParameter) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        count++;
    }

    // методы получения / геттеры
    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }   

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    // Метод установки / сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public abstract void attack();

    public static int getCount() {
        return count;
    }
    @Override   
    public String toString() {
        return "Имя: " + name + "\n" +
                "Здоровье: " + health + "\n" +
                "Атака: " + attack + "\n" +
                "Защита: " + defense + "\n";
    }
}