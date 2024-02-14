package homework_20;

public class Laundry {
    private String name;
    private String material;
    private String color;

    public Laundry(String name, String material, String color) {
        this.name = name;
        this.material = material;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
