package homework_23.worldOfmagic;

public class Archer extends GameCharacter {
    public Archer(int health) {
        super(health);
    }

    @Override
    public void attack() {
        System.out.println("Archer shoots a bow. Current health level: " + health);
    }
}
