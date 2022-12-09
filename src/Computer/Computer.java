package Computer;

public class Computer {
    int cost;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String toString() {
        return "Computer{cost=" + this.cost
                + ", model='" + this.model
                + "', ram=" + this.ram
                + ", hdd=" + this.hdd
                + "}";
    }
}
