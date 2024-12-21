package Strategy;

public class OplatiPayment implements PaymentStrategy {
    private final String number;

    public OplatiPayment(String number) {
        this.number = number;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " через Оплати аккаунт: " + number);
    }
}