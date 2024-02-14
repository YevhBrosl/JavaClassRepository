package homework_21;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        processor = new Processor("Intel", "Core i7-1355U", 1.7, 10);
        memory = new Memory("Kingston", "KF432C16BB116", 16, 3200);
        storage = new Storage("Seagate", "Barracuda", 1);
    }
}
