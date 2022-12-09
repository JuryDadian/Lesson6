package Computer;

public class RAM {
    String name;
    int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String toString() {
        return "RAM{name='" + this.name
                + "', volume=" + this.volume
                + "}";
    }
}
