package ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 5, 5);
        System.out.println(atm);
        atm.addMoney("fifties", 4);
        System.out.println(atm.getMoney(590));
    }

}
