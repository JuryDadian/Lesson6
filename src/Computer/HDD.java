package Computer;

public class HDD {
    String name;
    int volume;
    String type;

    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String toString() {
        return "HDD{name='" + this.name
                + "', volume=" + this.volume
                + ", type='" + this.type
                + "'}";
    }
}
