package lesson_21;

public class AutoBus {
    //для создания связи типа HAS-A мы определяем поле класса,
    // которое будет хранить ссылку на объект другого класса
    // направленность связи - однонаправленная или двунаправленная

    // Кардинальность связи - определяет, сколько объектов одного класса
    // может быть ассоциировано с объектом другого класса:
    //1. One-to-one (Один к одному) - автобус к двигателю (каждый автобус может иметь тольео один двигатель,
    // и на каждый двигатель приходится только один автобус)
    //2. One-to-many (Один ко многим) - автобус и пассажиры (один автобус может перевозить несколько пассажиров)
    // У автобуса будет массив пассажиров
    // 3. Many-to-many (Многие ко многим) - автобусный парк и список остановок:
    // - каждый автобус может останавливаться на многих остановках
    // - на каждой остановке может останавливаться множество автобусов

    private BusDriver driver;// агрегация ("мягкая" связь)
    private AutoPilot autoPilot; // композиция ("жесткая" неразрывная связь)
    private int capacity;
    // организуем связь пассажиров с автобусом one-to-many
    private final Passenger[] passengers; // список пассажиров, которые сейчас в автобусе
    private int countPassenger; // количество пассажиров автобуса в данный момент


    public AutoBus(BusDriver busDriver, int capacity) {
        this.driver = busDriver;
        busDriver.setAutoBus(this);
        autoPilot = new AutoPilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    // посадка пассажира в автобус
    public boolean takePassenger(Passenger passenger) {
        //проверка свободного места
        // если есть - добавить пассажира в автобус (в массив пассажиров)
        // возвратить boolean - отчет об успешности посадки
        if (capacity > countPassenger) {
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир сел в автобус");
            return true;
        }
        System.out.println("Мест нет");
        return false;
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
        driver.setAutoBus(this);
    }

    public String toString() {
        //TODO переписать, используя StringBuilder
        // добавить в эту строку список пассажиров
        StringBuilder sb = new StringBuilder("{");
        sb.append("Autobus: {").append(" driver: ").append(driver.getLicenseNumber()).append("; autopilot: ").append(autoPilot.getSoftwareVersion()).append("; passenger list: ").append(createStringByPassengersList()).append("}");
        sb.append("; ");
        String result = sb.toString();
        return result;
    }

    public String createStringByPassengersList() {
        //перебрать список пассажиров, "приклеить" к строке пассажира (в едином виде id + name)
        //т.к. пассажир - ссылочный тип данных - приклеивать только не null ссылки
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                //добавляю инфо о пассажире
                Passenger current = passengers[i];
                sb.append("Passenger: {id: ").append(current.getId()).append("; name: ").append(current.getName()).append("}");
                sb.append("; ");
            }
        }
        //нам надо проверить, был ли добавлен хоть один пассажир
        // если был - отрезать 2 последних символа
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();

    }
}
