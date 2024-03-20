package homework_44;

public class DataTransfer {
    private String userName;
    private int value;

    public DataTransfer(String record) {
        String[] data = record.split(":");
        // [user1, 2050]

        this.userName = data[0];
        this.value = Integer.parseInt(data[1]);
    }

    public String getUserName() {
        return userName;
    }

    public int getValue() {
        return value;
    }
}
