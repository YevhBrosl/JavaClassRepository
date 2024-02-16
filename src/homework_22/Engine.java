package homework_22;

public class Engine {

    private final long id;
    private static long idCounter;
    private int power;
    private final String typePower;

    private boolean isActive;

    public Engine(int power, String typePower) {
        this.power = power;
        this.typePower = typePower;
        this.id = idCounter++;
    }

    public void start() {
        // проверю запущен ли уже двигатель
        // Если нет - запустить

        if (!isActive) {
            isActive = true;
            System.out.println("Двигатель " + id + " запущен");
        } else {
            System.out.println("Двигатель уже работает");
        }
    }

    public void stop() {
        isActive = false;
        System.out.printf("Двигатель id: %d остановлен\n", id);
    }

    @Override
    public String toString() {
        return "Engine {" +
                "id=" + id +
                ", power=" + power +
                ", isActive=" + isActive +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypePower() {
        return typePower;
    }
}

