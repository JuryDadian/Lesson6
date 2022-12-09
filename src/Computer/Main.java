package Computer;

public class Main {

    public static void main(String[] args) {
        RAM ram = new RAM("Kingston", 20);
        HDD hdd = new HDD("TOSHIBA", 512, "Interior");

        Computer computer1 = new Computer(100, "Acer");
        Computer computer2 = new Computer(200, "DELL", ram, hdd);

        System.out.println(computer1);
        System.out.println(computer2);
    }
}