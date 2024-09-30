class mermaid extends Monster {
    protected int swimmingSpeed;

    public mermaid() {
        this.swimmingSpeed = 10;
    }

    public mermaid(String name, int health, int attack, int defense, int swimmingSpeed) {
        super(name, health, attack, defense, swimmingSpeed);
            this.swimmingSpeed = swimmingSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void attack() {
        System.out.println("Русалка поёт песнопения");
    }

    @Override
    public String toString() {
        return super.toString() + "Скорость плавания: " + swimmingSpeed + "\n";
    }
}