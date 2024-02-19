package homework_24.sport;

//Создайте интерфейсы Swimmer и Runner с методами swim и run соответственно.
//Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
//Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
public class Triathlete implements Swimmer, Runner {

    private String name;
    private String country;

    private int runSpeed;
    private int swimSpeed;

    public Triathlete(String name, String country, int runSpeed, int swimSpeed) {
        this.name = name;
        this.country = country;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public void run() {
        System.out.println("Athlete " + name + " from " + country + " runs a distance at the speed of " + runSpeed);
    }

    @Override
    public void swim() {
        System.out.println("Athlete " + name + " from " + country + " swims a distance at the speed of " + swimSpeed);
    }
}
