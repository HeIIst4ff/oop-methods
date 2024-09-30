class triton extends mermaid {
    protected int WaterPower;

    public triton() {
        this.WaterPower = 25;
    }
    
    public triton(String name, int health, int attack, int defense, int swimmingSpeed, int WaterPower) {
        super (name, health, attack, defense, swimmingSpeed);
        this.WaterPower = WaterPower;
    }
    
    public int getWaterPower() {
        return WaterPower;
    }

    public void setWaterPower(int WaterPower) {
        this.WaterPower = WaterPower;
    }

    @Override
    public void attack() {
        System.out.println("Тритон использует силу моря");
    }

    @Override
    public String toString() {
        return super.toString() + "Сила моря: " + WaterPower + "\n";
    }
}