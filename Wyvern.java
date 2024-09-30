class Wyvern extends Dragon {
    protected int flightSpeed;

    public Wyvern() {
        this.flightSpeed = 50;
    }

    public Wyvern(String name, int health, int attack, int defense, int magic, int flightSpeed) {
        super(name, health, attack, defense, magic); 
        this.flightSpeed = flightSpeed;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void attack() {
        System.out.println("Виверна атакует крыльями!");
    }

    @Override
    public String toString() {
        return super.toString() + "Скорость полета: " + flightSpeed + "\n";
    }
}