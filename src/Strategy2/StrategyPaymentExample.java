package Strategy2;

public class StrategyPaymentExample {
    public static void main(String[] args) {
        //STRATEGY2
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "1234"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Nurcan Alkis", "1234567890123456", "786", "12/15"));

    }
}
