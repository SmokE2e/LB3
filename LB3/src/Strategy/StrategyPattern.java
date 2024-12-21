package Strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(50);

        cart.setPaymentStrategy(new OplatiPayment("+375(33)688-73-12"));
        cart.checkout(50);
    }
}