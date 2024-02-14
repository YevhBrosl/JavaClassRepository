package lesson_21;

public class BusDriver {

    private String licenseNumber;
    private AutoBus autoBus; // организация двунаправленной связи

    public BusDriver(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public AutoBus getAutoBus() {
        return autoBus;
    }

    public void setAutoBus(AutoBus autoBus) {
        this.autoBus = autoBus;
    }
}
