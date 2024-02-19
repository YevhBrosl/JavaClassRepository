package homework_23.worldOfmagic;

 public abstract class GameCharacter {

    int health;
    protected abstract void attack();

     public GameCharacter(int health) {
         this.health = health;
     }

     public int getHealth() {
         return health;
     }

     public void setHealth(int health) {
         this.health = health;
     }
 }
