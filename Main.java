import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println();
        
        Monster goblin = createGoblin(scanner);
        Monster goblinArcher = createGoblinArcher(scanner);
        Monster mermaid = createMermaid(scanner);
        Monster triton = createTriton(scanner);
        Monster dragon = createDragon(scanner);
        Monster wyvern = createWyvern(scanner);

        System.out.println("Создано монстров: " + Monster.getCount());
        System.out.println("-----");
        System.out.println(goblin);
        System.out.println(goblinArcher);
        System.out.println(mermaid);
        System.out.println(triton);
        System.out.println(dragon);
        System.out.println(wyvern);
        scanner.close();
    }

    private static Monster createGoblin(Scanner scanner) {
        System.out.println("Введите информацию о Goblin:");
        System.out.print("Имя ");
        String name = scanner.nextLine();
        System.out.print("Здоровье ");
        int health = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Атака ");
        int attack = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Защита ");
        int defense = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ловкость ");
        int agility = scanner.nextInt();
        scanner.nextLine();
        if (name.isEmpty() && health == 0 && attack == 0 && defense == 0) {
            return new Goblin();
        } else {
            return new Goblin(name, health, attack, defense, agility);
        }
    }

    private static Monster createGoblinArcher(Scanner scanner) {
        System.out.println("Введите информацию о GoblinArcher:");
        System.out.print("Имя ");
        String name = scanner.nextLine();
        System.out.print("Здоровье ");
        int health = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Атака ");
        int attack = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Защита ");
        int defense = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ловкость ");
        int agility = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Дальность атаки ");
        int range = scanner.nextInt();
        scanner.nextLine();

        if (name.isEmpty() && health == 0 && attack == 0 && defense == 0) {
            return new GoblinArcher();
        } else {
            return new GoblinArcher(name, health, attack, defense, agility, range);
        }
    }

    private static Monster createMermaid(Scanner scanner) {
        System.out.println("Введите информацию о Mermaid:");
        System.out.print("Имя ");
        String name = scanner.nextLine();
        System.out.print("Здоровье ");
        int health = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ататка ");
        int attack = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Защита ");
        int defense = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Скорость плавания ");
        int swimmingSpeed = scanner.nextInt();
        scanner.nextLine(); 

        if (name.isEmpty() && health == 0 && attack == 0 && defense == 0) {
            return new mermaid();
        } else {
            return new mermaid(name, health, attack, defense, swimmingSpeed);
        }
    }

    private static Monster createTriton(Scanner scanner) {
        System.out.println("Введите информацию о Triton:");
        System.out.print("Имя ");
        String name = scanner.nextLine();
        System.out.print("Здоровье ");
        int health = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Атака ");
        int attack = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Защита ");
        int defense = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Скорость плавания ");
        int swimmingSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Мощность магии воды ");
        int WaterPower = scanner.nextInt();
        scanner.nextLine();

        if (name.isEmpty() && health == 0 && attack == 0 && defense == 0) {
            return new triton();
        } else {
            return new triton(name, health, attack, defense, swimmingSpeed, WaterPower);
        }
    }

    private static Monster createDragon(Scanner scanner) {
        System.out.println("Введите информацию о Dragon:");
        System.out.print("Имя ");
        String name = scanner.nextLine();
        System.out.print("Здоровье ");
        int health = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ататка ");
        int attack = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Защита ");
        int defense = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Магия ");
        int magic = scanner.nextInt();
        scanner.nextLine();

        if (name.isEmpty() && health == 0 && attack == 0 && defense == 0) {
            return new Dragon();
        } else {
            return new Dragon(name, health, attack, defense, magic);
        }
    }

    private static Monster createWyvern(Scanner scanner) {
        System.out.println("Введите информацию о Wyvern:");
        System.out.print("Имя ");
        String name = scanner.nextLine();
        System.out.print("Здоровье ");
        int health = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Атака ");
        int attack = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Защита ");
        int defense = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Магия ");
        int magic = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Скорость полёта ");
        int flightSpeed = scanner.nextInt();
        scanner.nextLine();

        if (name.isEmpty() && health == 0 && attack == 0 && defense == 0) {
            return new Wyvern();
        } else {
            return new Wyvern(name, health, attack, defense, magic, flightSpeed);
        }
    }
}
    
