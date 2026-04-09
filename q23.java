class ChatApplication {

    public static void main(String[] args) {

        Thread sender = new Thread(() -> {
            try {
                System.out.println("Sending message...");
                Thread.sleep(1000);
                System.out.println("Message sent");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread receiver = new Thread(() -> {
            try {
                System.out.println("Receiving message...");
                Thread.sleep(1500);
                System.out.println("Message received");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread lifecycle demonstration
        System.out.println("Sender State: " + sender.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender State after start: " + sender.getState());
    }
}