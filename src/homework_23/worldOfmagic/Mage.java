package homework_23.worldOfmagic;

public class Mage extends GameCharacter {
    public Mage(int health) {
        super(health);
    }

    @Override
    public void attack() {
        System.out.println("Mage casts a spell. Current health level: " + health);
    }
}
