import java.util.Scanner;

public class CreditCard {
    String numberScore;
    int sum;

    public void addSum(int sum1) {
        sum = sum + sum1;
    }

    public void takeOffSum(int sum1) {
        if (sum1 < sum) {
            sum = sum - sum1;
        } else {
            System.out.println("Недостаточно средств на счете " + numberScore);
        }
    }

    CreditCard (String numberScore, int sum) {
        this.numberScore = numberScore;
        this.sum = sum;

    }

    public static void main(String[] args) {
        CreditCard Card1 = new CreditCard("A001", 100);
        CreditCard Card2 = new CreditCard("B002", 20);
        CreditCard Card3 = new CreditCard("C003", 70);
        System.out.println(Card1);
        System.out.println(Card2);
        System.out.println(Card3);

        Card1.addSum(40);
        Card2.addSum(70);
        Card3.takeOffSum(50);

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

