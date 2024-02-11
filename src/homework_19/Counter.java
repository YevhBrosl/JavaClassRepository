package homework_19;

public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }
    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(10);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.decrement();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.increment();
        System.out.println(counter.getValue());
    }

}
