package ATM;

public class ATM {

    private int hundreds;
    private int fifties;
    private int twenties;

    public final static String HUNDREDS = "hundreds";
    public final static String FIFTIES = "fifties";
    public final static String TWENTIES = "twenties";

    public final static int hundredsAmount = 10;
    public final static int fiftiesAmount = 10;
    public final static int twentiesAmount = 10;


    public ATM(int hundreds, int fifties, int twenties) {

        this.hundreds = hundreds;
        this.fifties = fifties;
        this.twenties = twenties;
    }

    public int getHundreds() {
        return hundreds;
    }
    public int getFifties() {
        return fifties;
    }

    public int getTwenties() {
        return twenties;
    }


    @Override
    public String toString() {
        return "ATM{" +
                "fifties=" + fifties +
                ", tens=" + hundreds +
                ", twenties=" + twenties +
                '}';
    }

    public void addMoney(String type, int amount) {
        if (getHundreds() + amount < hundredsAmount || getFifties() + amount < fiftiesAmount || getTwenties() + amount < twentiesAmount) {


            switch (type) {
                case (HUNDREDS):
                    hundreds = getHundreds() + amount;
                    break;

                case (FIFTIES):
                    fifties = getFifties() + amount;
                    break;

                case (TWENTIES):
                    twenties = getTwenties() + amount;
                    break;
            }
        } else {
            System.out.println("Невозможно добавить купюру");
        }
    }

    public boolean getMoney(int sum) {
        int havesum = getHundreds() * 100 + getFifties() * 50 + getTwenties() * 20;
        if (havesum < sum) {
            return false;
        } else {
            if (sum % 10 != 0) {
                System.out.println("Невозможно получить данную сумму,купюры только 20 50 100");
                return false;
            } else {
                int amounthundreds = sum / 100;
                int amountfift = (sum - amounthundreds * 100) / 50;
                int amounttwent = (sum - amounthundreds * 100 - amountfift * 50) / 20;
                System.out.println("  Кол-во 100: " + amounthundreds + "  Кол-во 50:  " + amountfift + "  Кол-во 20:  " + amounttwent);
            }
            return true;
        }
    }
}
