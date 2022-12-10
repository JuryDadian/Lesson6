package CreditCard;

public class CreditCard {
    String numberScore;
    int sum;

    public void getAdd() {
        sum += sum;
    }

    public void getTakeOff() {
        sum -= sum;
    }

    CreditCard (String numberScore, int sum) {
        this.numberScore = numberScore;
        this.sum = sum;

    }

    public static void main(String[] args) {
        CreditCard Card1 = new CreditCard("A001", 100);
        CreditCard Card2 = new CreditCard("B002", 20);
        CreditCard Card3 = new CreditCard("C003", 70);

        Card1.getAdd();
        Card2.getAdd();
        Card3.getTakeOff();

        System.out.println(Card1);
        System.out.println(Card2);
        System.out.println(Card3);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberScore='" + numberScore + '\'' +
                ", sum=" + sum +
                '}';
    }
}

