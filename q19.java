class OnlineShoppingSystem {

    public static void main(String[] args) {

        Thread payment = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        Thread order = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        payment.start();
        order.start();
    }
}