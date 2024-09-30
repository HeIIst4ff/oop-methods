class Dragon extends Monster {
    protected int Magic;

    public Dragon() {
        this.Magic = 50;
    }

    public Dragon(String name, int health, int attack, int defense, int magic) {
        super(name, health, attack, defense, magic);
        this.Magic = magic;
    }       

    public int getMagic() {
        return Magic;
    }

    public void setMagic(int Magic) {
        this.Magic = Magic;
    }

    @Override
    public void attack() {
        System.out.println("Использует огенное дыхание дракона");
    }

    @Override
    public String toString() {
        return super.toString() + "Магия: " + Magic + "\n";
    }
}