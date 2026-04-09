class Restaurant {

    private boolean foodReady = false;

    synchronized void prepareFood() {
        try {
            while (foodReady) {
                wait();
            }
            System.out.println("Chef prepared food");
            foodReady = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait();
            }
            System.out.println("Waiter served food");
            foodReady = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

class TestRestaurant {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Chef chef = new Chef(r);
        Waiter waiter = new Waiter(r);

        chef.start();
        waiter.start();
    }
}