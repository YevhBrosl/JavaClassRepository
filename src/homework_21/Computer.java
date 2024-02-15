package homework_21;

public class Computer {

    private String model;

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(String model, Processor processor, Memory memory, Storage storage) {
        processor = new Processor("Intel", "Core i7-1355U", 1.7, 10);
        memory = new Memory("Kingston", "KF432C16BB116", 16, 3200);
        storage = new Storage("Seagate", "Barracuda", 1);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder("Computer: {");
//        sb.append(" processor: brand - ").append(processor.getBrand()).append(", model - ").append(processor.getBrand()).append("; memory: ").append(Memory.getMemory()).append("; storage: ").append(Storage.getStorage()).append("}");
//        sb.append("; ");
//        return sb.toString();
//    }

//    public static void main(String[] args) {
//        Computer computer = new Computer("ROC-AMD");
//        System.out.println(computer.toString());
//
//    }
}
